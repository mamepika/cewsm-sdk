package jp.ac.aiit.pbl.format.sep2020;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class AzimuthAngleTest {
    @Test
    public void inCaseOfMinimumValue(){
        AzimuthAngle azimuthAngle = new AzimuthAngle("00000");
        assertThat(0.00, is(azimuthAngle.value()));
    }
    @Test
    public void inCaseOfMediumValue(){
        AzimuthAngle azimuthAngle = new AzimuthAngle("10000");
        assertThat(92.90, is(azimuthAngle.value()));
    }

    @Test
    public void inCaseOf01100(){
        assertThat(69.68, is(new AzimuthAngle("01100").value()));
    }
    @Test
    public void inCaseOfMaximumValue(){
        AzimuthAngle azimuthAngle = new AzimuthAngle("11111");
        assertThat(180.0, is(azimuthAngle.value()));
    }
}