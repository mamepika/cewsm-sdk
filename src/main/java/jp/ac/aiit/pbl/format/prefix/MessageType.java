package jp.ac.aiit.pbl.format.prefix;

public enum MessageType {
    MT43(43,"MT43"),
    MT44(44,"MT44");

    private int id;

    private String messageType;

    private MessageType(int id, String messageType){
        this.id  = id;
        this.messageType = messageType;
    }

    public int getId(){
        return id;
    }

    public String getMessageTypeString(){
        return messageType;
    }

    public static MessageType getById(int id){
        if(id == 43){
            return MT43;
        }else{
            return MT44;
        }
    }
}
