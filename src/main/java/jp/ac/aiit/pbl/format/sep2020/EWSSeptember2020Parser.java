package jp.ac.aiit.pbl.format.sep2020;

import jp.ac.aiit.pbl.format.CommonEWSMessage;
import jp.ac.aiit.pbl.format.EWSMessageParser;
import jp.ac.aiit.pbl.format.prefix.PrefixParser;

public class EWSSeptember2020Parser implements EWSMessageParser {

    public enum Format{

        MESSAGE_TYPE(30,32),
        COUNTRY(32,42);

        private int start;

        private int end;


        Format(int start, int end){
            this.start = start;
            this.end = end;
        }

        public String signalValue(String ewsCommonMessage){
            return ewsCommonMessage.substring(start,end);
        }

        public int getStart(){
            return start;
        }

        public int getEnd(){
            return end;
        }

    }

    public CommonEWSMessage parse(String ewsCommonMessage){
        EWSSeptember2020 september2020 = new EWSSeptember2020();
        PrefixParser prefixParser = new PrefixParser();
        september2020.setPrefix(prefixParser.parse(ewsCommonMessage));
        september2020.setMessageType(MessageType.getById(Format.MESSAGE_TYPE.signalValue(ewsCommonMessage)));
        september2020.setCountry(Country.getById(Format.COUNTRY.signalValue(ewsCommonMessage)));
        System.out.println(Format.COUNTRY.signalValue(ewsCommonMessage));

        //TODO
        return september2020;
    }
}
