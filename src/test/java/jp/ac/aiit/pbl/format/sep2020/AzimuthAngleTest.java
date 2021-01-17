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
    public void inCaseOfMaximumValue(){
        AzimuthAngle azimuthAngle = new AzimuthAngle("11111");
        Assert.assertThat(180.00, is(azimuthAngle.value()));
    }
}