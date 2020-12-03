package jp.ac.aiit.pbl.format.sep2020;

public class SemiMinorAxisLength {

    private Double value;

    public SemiMinorAxisLength(String axis){
        this.value = AxisLength.getById(axis).getLength();
    }

    public Double value(){
        return value;
    }
}
