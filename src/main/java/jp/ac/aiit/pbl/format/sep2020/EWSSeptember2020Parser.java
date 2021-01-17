package jp.ac.aiit.pbl.format.sep2020;

import jp.ac.aiit.pbl.format.CommonEWSMessage;
import jp.ac.aiit.pbl.format.EWSMessageParser;
import jp.ac.aiit.pbl.format.prefix.PrefixParser;

import java.text.Normalizer;

public class EWSSeptember2020Parser implements EWSMessageParser {

    public enum Format{

        MESSAGE_TYPE(0,2),
        COUNTRY(2,12),
        PROVIDER(12,16),
        EVENT(16,23),
        SEVERITY(23,25),
        EVENT_ONSET(25,41),
        GUIDANCE_LIBRARY(41,42),
        GUIDANCE_TO_REACT(42,50),
        LATITUDE(50,66),
        LONGITUDE(66,83),
        SEMI_MAJOR_AXIS_LENGTH(83,87),
        SEMI_MINOR_AXIS_LENGTH(87,91),
        SEMI_MAJOR_AXIS_AZIMUTH_ANGLE(91,96),
        SPECIFIC_SETTINGS(96,116);

        private int start;

        private int end;


        Format(int start, int end){
            this.start = start;
            this.end = end;
        }

        public String signalValue(String ewsCommonMessage){
            return ewsCommonMessage.substring(start,end);
        }

        public int getStart(){
            return start;
        }

        public int getEnd(){
            return end;
        }

    }

    public CommonEWSMessage parse(String ewsCommonMessage){
        EWSSeptember2020 september2020 = new EWSSeptember2020();
        PrefixParser prefixParser = new PrefixParser();
        september2020.setPrefix(prefixParser.parse(ewsCommonMessage));
        String message = ewsCommonMessage.substring(14);
        september2020.setMessageType(MessageType.getById(Format.MESSAGE_TYPE.signalValue(message)));
        september2020.setCountry(Country.getById(Integer.toString(Integer.parseInt(Format.COUNTRY.signalValue(message),2))));
        september2020.setProvider(Format.PROVIDER.signalValue(message));
        september2020.setEvent(Event.getById(Format.EVENT.signalValue(message)));
        september2020.setSeverity(Severity.getById(Format.SEVERITY.signalValue(message)));
        september2020.setEventOnset(new EventOnset(Format.EVENT_ONSET.signalValue(message)));
        september2020.setProvider(Format.PROVIDER.signalValue(message));
        Guidance guidance = new Guidance(Integer.toString(Integer.parseInt(Format.COUNTRY.signalValue(message),2)),Format.GUIDANCE_LIBRARY.signalValue(message));
        september2020.setGuidanceToReact(guidance.getById(Format.GUIDANCE_TO_REACT.signalValue(message)));
        september2020.setGuidanceToReact(GeneralGuidanceToReact.getById(Format.GUIDANCE_TO_REACT.signalValue(message)));
        september2020.setLatitude(Coordinate.calcLatitude(Format.LATITUDE.signalValue(message)));
        september2020.setLongitude(Coordinate.calcLongitude(Format.LONGITUDE.signalValue(message)));
        september2020.setSemiMajorAxisLength(new SemiMajorAxisLength(Format.SEMI_MAJOR_AXIS_LENGTH.signalValue(message)));
        september2020.setSemiMinorAxisLength(new SemiMinorAxisLength(Format.SEMI_MINOR_AXIS_LENGTH.signalValue(message)));
        september2020.setAzimuthAngle(new AzimuthAngle(Format.SEMI_MAJOR_AXIS_AZIMUTH_ANGLE.signalValue(message)));
        return september2020;
    }
}
