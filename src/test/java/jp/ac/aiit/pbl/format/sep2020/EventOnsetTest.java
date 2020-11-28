package jp.ac.aiit.pbl.format.sep2020;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class EventOnsetTest {

    @Test
    public void inCaseOfYYYYMM011759(){
        EventOnset onset = new EventOnset("0000110001111011");
        assertThat(onset.value().getDayOfMonth(),is(1));
        assertThat(onset.value().getHour(),is(17));
        assertThat(onset.value().getMinute(),is(59));
    }
}
