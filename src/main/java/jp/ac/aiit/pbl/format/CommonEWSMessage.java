package jp.ac.aiit.pbl.format;

import jp.ac.aiit.pbl.format.prefix.Prefix;
import jp.ac.aiit.pbl.format.sep2020.*;

import java.time.ZonedDateTime;

public interface CommonEWSMessage {

    public Prefix getPrefix();

    public MessageType getMessageType();

    public Country getCountry();

    public String getProvider();

    public Severity getSeverity();

    public GuidanceToReact getGuidanceToReact();

    public Double getLatitude();

    public Double getLongitude();

    public EventOnset getEventOnset();

    public SemiMajorAxisLength getSemiMajorAxisLength();

    public SemiMinorAxisLength getSemiMinorAxisLength();

    public AzimuthAngle getAzimuthAngle();

    public String toString();

}
