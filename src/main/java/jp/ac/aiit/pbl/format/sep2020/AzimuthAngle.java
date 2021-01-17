package jp.ac.aiit.pbl.format.sep2020;

public class AzimuthAngle {

    private static Double interval = 5.80645;

    private Double value;

    public AzimuthAngle(String intervalString){
        this.value = (double)Math.round(interval * Long.parseLong(intervalString,2) * 100 /100);
    }

    public Double value(){
        return value;
    }
}
