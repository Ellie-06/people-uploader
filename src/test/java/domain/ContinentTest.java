package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContinentTest {

    @Test
    void valueOf() {
        String continent = "AFRICA";
        assertEquals(Continent.AFRICA, Continent.valueOf(continent));
    }
}