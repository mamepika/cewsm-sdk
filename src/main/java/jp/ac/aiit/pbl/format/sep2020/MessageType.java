package jp.ac.aiit.pbl.format.sep2020;

import java.util.Arrays;

public enum MessageType {

    ALERT("00","Alert"),
    UPDATE("01","Update"),
    TEST("10","Test"),
    CANCEL("11","Cancel");

    private String id;

    private String messageType;

    public String getId(){
        return id;
    }

    public String getMessageType(){
        return messageType;
    }

    private MessageType(String id, String messageType){
        this.id = id;
        this.messageType = messageType;
    }

    public static MessageType getById(String id){
        return Arrays.stream(MessageType.values())
                .filter(data -> data.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

}
