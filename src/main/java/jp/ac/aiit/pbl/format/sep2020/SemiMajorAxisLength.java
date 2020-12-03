package jp.ac.aiit.pbl.format.sep2020;

public class SemiMajorAxisLength {

    private Double value;

    public SemiMajorAxisLength(String axis){
        this.value = AxisLength.getById(axis).getLength();
    }

    public Double value(){
        return value;
    }
}
