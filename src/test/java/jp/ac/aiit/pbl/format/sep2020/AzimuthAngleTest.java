package jp.ac.aiit.pbl.format.sep2020;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class AzimuthAngleTest {
    @Test
    public void inCaseOfMinimumValue(){
        AzimuthAngle azimuthAngle = new AzimuthAngle("00000");
        Assert.assertThat(0.00, is(azimuthAngle.value()));
    }
    @Test
    public void inCaseOfMediumValue(){
        AzimuthAngle azimuthAngle = new AzimuthAngle("10000");
        Assert.assertThat(92.9032, is(azimuthAngle.value()));
    }
    @Test
    public void inCaseOfMaximumValue(){
        AzimuthAngle azimuthAngle = new AzimuthAngle("11111");
        Assert.assertThat(179.99994999999998, is(azimuthAngle.value()));
    }
}