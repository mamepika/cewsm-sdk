package jp.ac.aiit.pbl;

import jp.ac.aiit.pbl.format.CommonEWSMessage;
import jp.ac.aiit.pbl.format.CommonEWSMessageFormat;
import jp.ac.aiit.pbl.format.EWSMessageParser;
import jp.ac.aiit.pbl.format.EWSMessageParserFactory;

import java.util.Arrays;
import java.util.List;

public class CommonEWSMessageDecoder {

    private EWSMessageParser parser;

    public CommonEWSMessageDecoder(CommonEWSMessageFormat format){
        this.parser = EWSMessageParserFactory.create(format);
    }

    public CommonEWSMessage decode(String commonEWSMessage) throws IllegalArgumentException{
        return this.parser.parse(toBinaryString(commonEWSMessage));
    }


    /**
     * Transforming hexadecimal number to binary number
     * @param commonEWSMessage disaster information in hexadecimal number
     * @return disaster information in binary number
     */
    private String toBinaryString(String commonEWSMessage){
        StringBuilder binaryString = new StringBuilder();
        List<String> messages = Arrays.asList(commonEWSMessage.split(""));
        for(int i =0; i < messages.size();i++){
            binaryString.append(String.format("%4s",Integer.toBinaryString(Integer.parseInt(messages.get(i),16))).replace(" ","0"));
        }
        return binaryString.toString();
    }
}
