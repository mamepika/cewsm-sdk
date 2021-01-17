package jp.ac.aiit.pbl.format.sep2020;

public class AzimuthAngle {

    private static Double interval = 5.80645;

    private Double value;

    public AzimuthAngle(String intervalString){
        this.value = interval * Long.parseLong(intervalString,2);
    }

    public Double value(){
        return value;
    }
}
