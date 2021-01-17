package jp.ac.aiit.pbl.format.sep2020;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

public class SemiMinorAxisLengthTest {
    @Test
    public void inCaseOfMinimum(){
        SemiMinorAxisLength semiMinorAxisLength = new SemiMinorAxisLength("0001");
        Assert.assertThat(635L, is(semiMinorAxisLength.value()));
    }
    @Test
    public void inCaseOfMedium(){
        SemiMinorAxisLength semiMinorAxisLength = new SemiMinorAxisLength("1000");
        Assert.assertThat(83993L, is(semiMinorAxisLength.value()));
    }
    @Test
    public void inCaseOfMaximum(){
        SemiMinorAxisLength semiMinorAxisLength = new SemiMinorAxisLength("1111");
        Assert.assertThat(11103363L, is(semiMinorAxisLength.value()));
    }
}