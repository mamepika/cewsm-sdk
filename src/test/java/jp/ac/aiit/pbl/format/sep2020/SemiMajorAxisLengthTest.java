package jp.ac.aiit.pbl.format.sep2020;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class SemiMajorAxisLengthTest {
    @Test
    public void inCaseOfMinimum(){
        SemiMajorAxisLength semiMajorAxisLength = new SemiMajorAxisLength("0001");
        Assert.assertThat(635L, is(semiMajorAxisLength.value()));
    }
    @Test
    public void inCaseOfMedium(){
        SemiMajorAxisLength semiMajorAxisLength = new SemiMajorAxisLength("1000");
        Assert.assertThat(83993L, is(semiMajorAxisLength.value()));
    }
    @Test
    public void inCaseOfMaximum(){
        SemiMajorAxisLength semiMajorAxisLength = new SemiMajorAxisLength("1111");
        Assert.assertThat(11103363L, is(semiMajorAxisLength.value()));
    }

}