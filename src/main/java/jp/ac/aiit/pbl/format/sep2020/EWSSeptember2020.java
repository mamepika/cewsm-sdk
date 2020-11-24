package jp.ac.aiit.pbl.format.sep2020;

import jp.ac.aiit.pbl.format.EWSCommonMessage;
import jp.ac.aiit.pbl.format.prefix.Prefix;

public class EWSSeptember2020 implements EWSCommonMessage {

    private Prefix prefix;

    private MessageType messageType;

    private Country country;

    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }

    @Override
    public Prefix getPrefix() {
        return prefix;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "EWSSeptember2020{" +
                "prefix=" + prefix +
                ", messageType=" + messageType +
                ", country=" + country +
                '}';
    }
}
