package jp.ac.aiit.pbl.format.sep2020;

import java.util.Arrays;

public enum AxisLength {

    AXIS_LENGTH_1("0000",Double.parseDouble("316")),
    AXIS_LENGTH_2("0001",Double.parseDouble("635")),
    AXIS_LENGTH_3("0010",Double.parseDouble("1277")),
    AXIS_LENGTH_4("0011",Double.parseDouble("2565")),
    AXIS_LENGTH_5("0100",Double.parseDouble("5154")),
    AXIS_LENGTH_6("0101",Double.parseDouble("10355")),
    AXIS_LENGTH_7("0110",Double.parseDouble("20806")),
    AXIS_LENGTH_8("0111",Double.parseDouble("41803")),
    AXIS_LENGTH_9("1000",Double.parseDouble("83993")),
    AXIS_LENGTH_10("1001",Double.parseDouble("168761")),
    AXIS_LENGTH_11("1010",Double.parseDouble("339081")),
    AXIS_LENGTH_12("1011",Double.parseDouble("681292")),
    AXIS_LENGTH_13("1100",Double.parseDouble("1368875")),
    AXIS_LENGTH_14("1101",Double.parseDouble("2750388")),
    AXIS_LENGTH_15("1110",Double.parseDouble("5526170")),
    AXIS_LENGTH_16("1111",Double.parseDouble("11103363"));

    private String id;

    private Double length;

    public String getId(){
        return id;
    }

    public Double getLength(){
        return length;
    }

    private AxisLength(String id, Double length){
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
