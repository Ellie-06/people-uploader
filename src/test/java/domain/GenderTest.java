package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenderTest {

    @Test
    void parse() {
        String f = "F";
        String m = "m";
        String n = "n";
        String a = "a";

        assertEquals(Gender.FEMALE, Gender.parse(f));
        assertEquals(Gender.MALE, Gender.parse(m));
        assertEquals(Gender.NEUTRAL, Gender.parse(n));
        assertEquals(null, Gender.parse(a));
    }

    @Test
    void valueOf() {
        String n = "NEUTRAL";

        assertEquals(Gender.NEUTRAL, Gender.valueOf(n));
    }
}