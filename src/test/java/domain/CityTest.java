package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {

    @Test
    void parse() {
        String city = "KABUL";
        assertEquals(City.KABUL, City.parse(city));
    }

    @Test
    void values() {
        String city = "ANDORRA LA VELLA";
        assertEquals(City.ANDORRA_LA_VELLA, City.parse(city));
    }

    @Test
    void valueOf() {
        String city = "luanda";
        assertEquals(City.LUANDA, City.parse(city));
    }
}