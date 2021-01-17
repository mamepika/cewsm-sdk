package jp.ac.aiit.pbl.format.sep2020;

import jp.ac.aiit.pbl.format.CommonEWSMessage;
import jp.ac.aiit.pbl.format.prefix.Prefix;

public class EWSSeptember2020 implements CommonEWSMessage {

    private Prefix prefix;

    private MessageType messageType;

    private Country country;

    private String provider;

    private Event event;

    private Severity severity;

    private EventOnset eventOnset;

    private GuidanceToReact guidanceToReact;

    private Double latitude;

    private Double longitude;

    private SemiMajorAxisLength semiMajorAxisLength;

    private SemiMinorAxisLength semiMinorAxisLength;

    private AzimuthAngle azimuthAngle;

    public Prefix getPrefix() {
        return prefix;
    }

    public void setPrefix(Prefix prefix) {
        this.prefix = prefix;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public EventOnset getEventOnset() {
        return eventOnset;
    }

    public void setEventOnset(EventOnset eventOnset) {
        this.eventOnset = eventOnset;
    }

    public GuidanceToReact getGuidanceToReact() {
        return guidanceToReact;
    }

    public void setGuidanceToReact(GuidanceToReact guidanceToReact) {
        this.guidanceToReact = guidanceToReact;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public SemiMajorAxisLength getSemiMajorAxisLength() {
        return semiMajorAxisLength;
    }

    public void setSemiMajorAxisLength(SemiMajorAxisLength semiMajorAxisLength) {
        this.semiMajorAxisLength = semiMajorAxisLength;
    }

    public SemiMinorAxisLength getSemiMinorAxisLength() {
        return semiMinorAxisLength;
    }

    public void setSemiMinorAxisLength(SemiMinorAxisLength semiMinorAxisLength) {
        this.semiMinorAxisLength = semiMinorAxisLength;
    }

    public AzimuthAngle getAzimuthAngle() {
        return azimuthAngle;
    }

    public void setAzimuthAngle(AzimuthAngle azimuthAngle) {
        this.azimuthAngle = azimuthAngle;
    }

    @Override
    public String toString() {
        return "EWSSeptember2020{" +
                "prefix=" + prefix +
                ", messageType=" + messageType +
                ", country=" + country +
                ", provider='" + provider + '\'' +
                ", event=" + event +
                ", severity=" + severity +
                ", eventOnset=" + eventOnset.value() +
                ", guidanceToReact=" + guidanceToReact +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", semiMajorAxisLength=" + semiMajorAxisLength.value() +
                ", semiMinorAxisLength=" + semiMinorAxisLength.value() +
                ", azimuthAngle=" + azimuthAngle.value() +
                '}';
    }
}
