package jp.ac.aiit.pbl.format.sep2020;

public class Longitude {

    private static final Double interval = 0.0027466;

    private Double value;

    private long intervalNumber;

    /**
     * Constructor
     * @param intervalString longitude in binary string which length is 17bits
     */
    public Longitude(String intervalString){
        if(intervalString.length() != 17){
            throw new IllegalArgumentException();
        }
        this.intervalNumber = Long.parseLong(intervalString,2);
        value =  -180.00 + intervalNumber * interval;
    }

    public Double value(){
        return value;
    }
}
