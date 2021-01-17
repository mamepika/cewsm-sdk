package jp.ac.aiit.pbl.format.sep2020;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class GuidanceTest {

    @Test
    public void inCaseOfJapanEvacuateUrbanArea(){
        Guidance guidance = new Guidance("392","1");
        assertThat(guidance.getById("00000000"),is(GeneralGuidanceToReact.EVACUATE_URBAN_AREAS));
    }

    @Test
    public void inCaseOfJapanExecuteUseTvRadio(){
        Guidance guidance = new Guidance("392","1");
        assertThat(guidance.getById("00010101"),is(GeneralGuidanceToReact.EXECUTE_USE_TV_RADIO_EMERGENCY_BROADCAST_SYSTEM_JAPANESE_WARNING_LEVEL_2));
    }
}
