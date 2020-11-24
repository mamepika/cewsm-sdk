package jp.ac.aiit.pbl;

import jp.ac.aiit.pbl.format.EWSCommonMessage;
import jp.ac.aiit.pbl.format.EWSCommonMessageFormat;
import jp.ac.aiit.pbl.format.EWSMessageParser;
import jp.ac.aiit.pbl.format.EWSMessageParserFactory;

import java.util.Arrays;
import java.util.List;

public class EWSCommonMessageDecoder {

    private EWSMessageParser parser;

    public EWSCommonMessageDecoder(EWSCommonMessageFormat format){
        this.parser = EWSMessageParserFactory.create(format);
    }

    public EWSCommonMessage decode(String ewsCommonMessage){
        //TODO
        //Handling exception
        return this.parser.parse(toBinaryString(ewsCommonMessage));
    }


    /**
     * Transforming hexadecimal number to binary number
     * @param ewsCommonMessage disaster information in hexadecimal number
     * @return disaster information in binary number
     */
    private String toBinaryString(String ewsCommonMessage){
        StringBuilder binaryString = new StringBuilder();
        List<String> messages = Arrays.asList(ewsCommonMessage.split(""));
        for(int i =0; i < messages.size();i++){
            binaryString.append(String.format("%4s",Integer.toBinaryString(Integer.parseInt(messages.get(i),16))).replace(" ","0"));
        }
        return binaryString.toString();
    }


}
