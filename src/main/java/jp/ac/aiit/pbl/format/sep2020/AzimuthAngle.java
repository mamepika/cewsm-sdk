package jp.ac.aiit.pbl.format.sep2020;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AzimuthAngle {

    private static Double interval = 5.80645;

    private Double value;

    public AzimuthAngle(String intervalString){
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(interval * Long.parseLong(intervalString,2)));
        this.value = bigDecimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public Double value(){
        return value;
    }
}
