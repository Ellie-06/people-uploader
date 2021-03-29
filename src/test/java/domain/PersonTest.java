package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void parse() {
        long id = 1;
        String firstName = "Tom";
        String lastName = "Jackson";
        Gender gender = Gender.MALE;
        String nationality = "Czech_Republic";
        String birthdate = "1995-01-01";
        String address = "1th_Broadway";
        City city = City.PRAGUE;

        Person person = new Person(id, firstName, lastName, gender, nationality, birthdate, address, city);

        String personInfo = "1 Tom Jackson m Czech_Republic 1995-01-01 1th_Broadway Prague";
        String nullPersonInfo = " ";

        assertEquals(person.getId(), Person.parse(personInfo).getId());
        assertEquals(person.getFirstName(), Person.parse(personInfo).getFirstName());
        assertEquals(person.getLastName(), Person.parse(personInfo).getLastName());
        assertEquals(person.getGender(), Person.parse(personInfo).getGender());
        assertEquals(person.getNationality(), Person.parse(personInfo).getNationality());
        assertEquals(person.getBirthdate(), Person.parse(personInfo).getBirthdate());
        assertEquals(person.getAddress(), Person.parse(personInfo).getAddress());
        assertEquals(person.getCity(), Person.parse(personInfo).getCity());

        assertEquals(null, Person.parse(nullPersonInfo));
    }
}