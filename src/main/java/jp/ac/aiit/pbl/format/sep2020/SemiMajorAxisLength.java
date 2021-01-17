package jp.ac.aiit.pbl.format.sep2020;

public class SemiMajorAxisLength {

    private long value;

    public SemiMajorAxisLength(String axis){
        this.value = AxisLength.getById(axis).getLength();
    }

    public long value(){
        return value;
    }
}
