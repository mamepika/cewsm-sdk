package jp.ac.aiit.pbl.format.sep2020;


import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class EventTest {
    @Test
    public void canGetEvent0000000() {
        Event event = Event.getById("0000000");
        Assert.assertThat("Geo",is(event.getEventCategory()));
        Assert.assertThat("Earthquake",is(event.getEventSubCategory()));
        Assert.assertThat("Sudden movement of a block of the Earth’s crust along a geological fault and associated ground shaking.",is(event.getDefinition1()));
        Assert.assertThat("",is(event.getDefinition2()));
    }

    @Test
    public void canGetEvent0010001() {
        Event event = Event.getById("0010001");
        Assert.assertThat("Geo",is(event.getEventCategory()));
        Assert.assertThat("Ash Fall",is(event.getEventSubCategory()));
        Assert.assertThat("Fine (less than 4 mm in diameter) unconsolidated volcanic debris blown into the atmosphere during an eruption; can remain airborne for long periods of time and travel considerable distance from the source.",is(event.getDefinition1()));
        Assert.assertThat("",is(event.getDefinition2()));
    }
    @Test
    public void canGetEvent0100010() {
        Event event = Event.getById("0100010");
        Assert.assertThat("Met",is(event.getEventCategory()));
        Assert.assertThat("Storm or Thunderstorm",is(event.getEventSubCategory()));
        Assert.assertThat("",is(event.getDefinition1()));
        Assert.assertThat("Meteorological event generating winds equal or higher than 10 on the Beaufort scale (Ref. WMO Classification)",is(event.getDefinition2()));
    }
    @Test
    public void canGetEvent0110110() {
        Event event = Event.getById("0110110");
        Assert.assertThat("Met",is(event.getEventCategory()));
        Assert.assertThat("Fog",is(event.getEventSubCategory()));
        Assert.assertThat("",is(event.getDefinition1()));
        Assert.assertThat("WMO Definition:  A suspension of very small, usually microscopic water droplets in the air, reducing visibility at the Earth’s surface",is(event.getDefinition2()));
    }
    @Test
    public void canGetEvent1000000() {
        Event event = Event.getById("1000000");
        Assert.assertThat("Safety",is(event.getEventCategory()));
        Assert.assertThat("Chemical Hazard",is(event.getEventSubCategory()));
        Assert.assertThat("Presence of hazardous chemical materials that present a risk or potential risk to the health of humans, animals, plants, or the environment",is(event.getDefinition1()));
        Assert.assertThat("",is(event.getDefinition2()));
    }
    @Test
    public void canGetEvent9999999999999() {
        Assert.assertThat(null,is(Event.getById("9999999999999")));
    }

}