package jp.ac.aiit.pbl.format.sep2020;

public class Coordinate {

    private static final Double interval = 0.0027466;


    public static Double calcLongitude(String intervalString){
        if(intervalString.length() != 17){
            throw new IllegalArgumentException();
        }
        long intervalNumber = Long.parseLong(intervalString,2);
        return intervalNumber == 131071 ? 180.00 : -180.00 + intervalNumber * interval;
    }

    public static Double calcLatitude(String intervalString){
        if(intervalString.length() != 16){
            throw new IllegalArgumentException();
        }
        long intervalNumber = Long.parseLong(intervalString,2);
        return intervalNumber == 65535 ? 90.00 : -90.00 + intervalNumber * interval;
    }
}
