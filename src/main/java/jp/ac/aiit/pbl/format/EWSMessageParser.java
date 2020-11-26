package jp.ac.aiit.pbl.format;

public interface EWSMessageParser {

    public CommonEWSMessage parse(String ewsCommonMessage);
}
