package jp.ac.aiit.pbl.format.sep2020;

import org.junit.Test;

public class LongitudeTest {

    @Test
    public void test(){
        Longitude longitude = new Longitude("00000000000000001");
        Longitude longitude1 = new Longitude("11111111111111111");
        System.out.println(longitude.value());
        System.out.println(longitude1.value());
    }
}
