package jp.ac.aiit.pbl.format.sep2020;

import java.util.Arrays;

public enum AxisLength {

    AXIS_LENGTH_1("0000",316),
    AXIS_LENGTH_2("0001",635),
    AXIS_LENGTH_3("0010",1277),
    AXIS_LENGTH_4("0011",2565),
    AXIS_LENGTH_5("0100",5154),
    AXIS_LENGTH_6("0101",10355),
    AXIS_LENGTH_7("0110",20806),
    AXIS_LENGTH_8("0111",41803),
    AXIS_LENGTH_9("1000",83993),
    AXIS_LENGTH_10("1001",168761),
    AXIS_LENGTH_11("1010",339081),
    AXIS_LENGTH_12("1011",681292),
    AXIS_LENGTH_13("1100",1368875),
    AXIS_LENGTH_14("1101",2750388),
    AXIS_LENGTH_15("1110",5526170),
    AXIS_LENGTH_16("1111",11103363);

    private String id;

    private long length;

    public String getId(){
        return id;
    }

    public long getLength(){
        return length;
    }

    private AxisLength(String id, long length){
        this.id = id;
        this.length = length;
    }

    public static AxisLength getById(String id){
        return Arrays.stream(AxisLength.values())
                .filter(data -> data.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
