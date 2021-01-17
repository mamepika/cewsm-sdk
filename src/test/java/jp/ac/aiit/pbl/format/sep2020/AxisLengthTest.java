package jp.ac.aiit.pbl.format.sep2020;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AxisLengthTest {
    @Test
    public void inCaseOfMinimumValue(){
        AxisLength axisLength = AxisLength.getById("0000");
        Assert.assertThat(316L, is(axisLength.getLength()));
    }
    @Test
    public void inCaseOfMaximumValue(){
        AxisLength axisLength = AxisLength.getById("1111");
        Assert.assertThat(11103363L, is(axisLength.getLength()));
    }
}