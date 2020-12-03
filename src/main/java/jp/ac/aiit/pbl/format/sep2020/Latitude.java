package jp.ac.aiit.pbl.format.sep2020;

public class Latitude {

    private static final Double interval = 0.0027466;

    private Double value;

    private long intervalNumber;

    /**
     * Constructor
     * @param intervalString latitude in binary string which length is 16bits
     */
    public Latitude(String intervalString){
        if(intervalString.length() != 16){
            throw new IllegalArgumentException();
        }
        this.intervalNumber = Long.parseLong(intervalString,2);
        value =  -90.00 + intervalNumber * interval;
    }

    public Double value(){
        return value;
    }

}
