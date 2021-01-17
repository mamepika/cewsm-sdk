package jp.ac.aiit.pbl.format.sep2020;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class GeneralGuidanceToReactTest {
    @Test
    public void inCaseOf00110000() {
        GeneralGuidanceToReact generalGuidanceToReact = GeneralGuidanceToReact.getById("00110000");
        Assert.assertThat("Turn off electrical/gas equipments and power (Japanese warning level 5)", is(generalGuidanceToReact.getInstruction()));
        Assert.assertThat("Stay inside and Execute - Execute the <instruction>", is(generalGuidanceToReact.getResponseType()));
    }
        @Test
        public void inCaseOf01100011() {
            GeneralGuidanceToReact generalGuidanceToReact = GeneralGuidanceToReact.getById("01100011");
            Assert.assertThat("End of containment", is(generalGuidanceToReact.getInstruction()));
            Assert.assertThat("AllClear – Situation is back to normal, information provided in <instruction>", is(generalGuidanceToReact.getResponseType()));
    }
        @Test
        public void inCaseOf01110111() {
            GeneralGuidanceToReact generalGuidanceToReact = GeneralGuidanceToReact.getById("01110111");
            Assert.assertThat("Unavailable guidance", is(generalGuidanceToReact.getInstruction()));
            Assert.assertThat("None – No action recommended", is(generalGuidanceToReact.getResponseType()));
    }
        @Test
        public void inCaseOf99999999() {
            Assert.assertThat(null, is(GeneralGuidanceToReact.getById("99999999")));
        }
}
