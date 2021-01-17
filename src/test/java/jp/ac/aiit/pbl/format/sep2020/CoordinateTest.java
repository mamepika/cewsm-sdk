package jp.ac.aiit.pbl.format.sep2020;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CoordinateTest {

    @Test
    public void minimumLatitude(){
        assertThat(Coordinate.calcLatitude("0000000000000000"),is(-90.0));
    }

    @Test
    public void latitudeCaseOf1111111000000101(){
        assertThat(Coordinate.calcLatitude("1111111000000101"),is(88.610));
    }

    @Test
    public void maximumLatitude(){
        assertThat(Coordinate.calcLatitude("1111111111111111"),is(90.0));
    }

    @Test
    public void minimumLongitude(){
        assertThat(Coordinate.calcLongitude("00000000000000000"),is(-180.0));
    }

    @Test
    public void maximumLongitude(){
        assertThat(Coordinate.calcLongitude("11111111111111111"),is(180.0));
    }
}