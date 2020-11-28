package jp.ac.aiit.pbl.format.sep2020;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class EventOnset {

    private ZonedDateTime zonedDateTime;

    /**
     * Constructor
     * @param eventOnset 16bits binary string of the part specified as the Event Onset
     */
    public EventOnset(String eventOnset){
        int day = Integer.parseInt(eventOnset.substring(0,5),2);
        int hour = Integer.parseInt(eventOnset.substring(5,10),2);
        int minute = Integer.parseInt(eventOnset.substring(10,16),2);
        ZonedDateTime temporaryTime = ZonedDateTime.now(ZoneId.of("UTC"));
        zonedDateTime = ZonedDateTime.of(temporaryTime.getYear(),temporaryTime.getMonthValue(),day,hour,minute,0,0,ZoneId.of("UTC"));
    }

    public EventOnset(String day, String hour, String minute){
        ZonedDateTime temporaryTime = ZonedDateTime.now(ZoneId.of("UTC"));
        zonedDateTime = ZonedDateTime.of(temporaryTime.getYear(),temporaryTime.getMonthValue(),Integer.parseInt(day,2),Integer.parseInt(hour,2),Integer.parseInt(minute,2),0,0,ZoneId.of("UTC"));
    }

    public ZonedDateTime value(){
        return zonedDateTime;
    }
}
