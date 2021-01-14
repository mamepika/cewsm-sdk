package jp.ac.aiit.pbl.format.prefix;

public class PrefixParser {

    public enum Format{

        PREAMBLE(0,8),
        MESSAGE_TYPE(8,14),
        REPORT_CLASSIFICATION(14,17),
        ORGANIZATION(17,23),
        SUBDIVISION_ORGANIZATION(23,34);

        private int start;

        private int end;

        public String signalValue(String ewsCommonMessage){
            return ewsCommonMessage.substring(start,end);
        }

        Format(int start, int end){
            this.start = start;
            this.end = end;
        }

        public int getStart(){
            return start;
        }

        public int getEnd(){
            return end;
        }
    }

    public Prefix parse(String ewsCommonMessage){
        Prefix prefix = new Prefix();
        prefix.setPreamble(Preamble.getById(Format.PREAMBLE.signalValue(ewsCommonMessage)));
        prefix.setMessageType(MessageType.getById(Integer.parseInt(Format.MESSAGE_TYPE.signalValue(ewsCommonMessage),2)));
        return prefix;

    }
}
