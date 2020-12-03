package jp.ac.aiit.pbl.format.sep2020;

import java.util.Arrays;

public enum AxisLength {

    AXIS_LENGTH_1("0000",Double.parseDouble("316")),
    AXIS_LENGTH_2("0000",Double.parseDouble("635")),
    AXIS_LENGTH_3("0000",Double.parseDouble("1277")),
    AXIS_LENGTH_4("0000",Double.parseDouble("2565")),
    AXIS_LENGTH_5("0000",Double.parseDouble("5154")),
    AXIS_LENGTH_6("0000",Double.parseDouble("10355")),
    AXIS_LENGTH_7("0000",Double.parseDouble("20806")),
    AXIS_LENGTH_8("0000",Double.parseDouble("41803")),
    AXIS_LENGTH_9("0000",Double.parseDouble("83993")),
    AXIS_LENGTH_10("0000",Double.parseDouble("168761")),
    AXIS_LENGTH_11("0000",Double.parseDouble("339081")),
    AXIS_LENGTH_12("0000",Double.parseDouble("681292")),
    AXIS_LENGTH_13("0000",Double.parseDouble("1368875")),
    AXIS_LENGTH_14("0000",Double.parseDouble("2750388")),
    AXIS_LENGTH_15("0000",Double.parseDouble("5526170")),
    AXIS_LENGTH_16("0000",Double.parseDouble("11103363"));

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
