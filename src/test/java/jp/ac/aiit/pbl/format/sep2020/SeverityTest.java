package jp.ac.aiit.pbl.format.sep2020;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SeverityTest {
    @Test
    public void inCaseOfExtreme(){
        Severity severity = Severity.getById("00");
        Assert.assertThat("Extreme - Extraordinary threat to life or property",
                is(severity.getSeverity()));
    }
    @Test
    public void inCaseOfSevere(){
        Severity severity = Severity.getById("01");
        Assert.assertThat("Severe - Significant threat to life or property",
                is(severity.getSeverity()));
    }
    @Test
    public void inCaseOfModerate(){
        Severity severity = Severity.getById("10");
        Assert.assertThat("Moderate - Possible threat to life or property",
                is(severity.getSeverity()));
    }
    @Test
    public void inCaseOfMinor(){
        Severity severity = Severity.getById("11");
        Assert.assertThat("Minor – Minimal to no known threat to life or property",
                is(severity.getSeverity()));
    }
}