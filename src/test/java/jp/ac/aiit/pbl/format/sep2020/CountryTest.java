package jp.ac.aiit.pbl.format.sep2020;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CountryTest {
        @Test
        public void canGetCountry12() { Assert.assertThat(Country.ALGERIA,is(Country.getById("12")));}
        @Test
        public void canGetCountry392() { Assert.assertThat(Country.JAPAN,is(Country.getById("392")));}
        @Test
        public void canGetCountry764() { Assert.assertThat(Country.THAILAND,is(Country.getById("764")));}
        @Test
        public void canGetCountry894() { Assert.assertThat(Country.ZAMBIA,is(Country.getById("894")));}
        @Test
        public void canGetCountry99999() { Assert.assertThat(null,is(Country.getById("99999")));}
    }