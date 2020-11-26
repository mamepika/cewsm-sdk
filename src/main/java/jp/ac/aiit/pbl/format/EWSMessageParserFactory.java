package jp.ac.aiit.pbl.format;

import jp.ac.aiit.pbl.format.sep2020.EWSSeptember2020Parser;

public class EWSMessageParserFactory {

    public static EWSMessageParser create(CommonEWSMessageFormat format){
        switch (format){
            case SEPTEMBER2020:
                return new EWSSeptember2020Parser();
            default:
                return null;
        }
    }
}
