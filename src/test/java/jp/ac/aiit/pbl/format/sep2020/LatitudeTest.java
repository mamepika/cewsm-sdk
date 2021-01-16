package jp.ac.aiit.pbl.format.sep2020;

import org.junit.Test;

import static org.junit.Assert.*;

public class LatitudeTest {

    @Test
    public void inCaseOfMinus90(){
        Latitude latitude = new Latitude("0000000000000000");
        System.out.println(latitude.value());
    }
    
    @Test
    public void inCaseOf90(){
        Latitude latitude = new Latitude("1111111111111111");
        System.out.println(latitude.value());
    }
}