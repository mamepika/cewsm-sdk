package jp.ac.aiit.pbl.format.sep2020;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class LatitudeTest {

    @Test
    public void inCaseOfMinimumValue(){
        Latitude latitude = new Latitude("0000000000000000");
        Assert.assertThat(-90.0, is(latitude.value()));
    }

    @Test
    public void inCaseOfMaximumValue(){
        Latitude latitude = new Latitude("1111111111111111");
        Assert.assertThat(89.99843100000001, is(latitude.value()));
    }
}