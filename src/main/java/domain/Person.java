package domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {

    private static final String REGEX_PATTERN = "(?<id>\\d+)\\s(?<firstname>\\w+)\\s(?<lastname>\\w+)\\s(?<gender>\\w)\\s(?<nationality>\\w+)\\s(?<birthdate>\\d{4}\\-\\d{2}\\-\\d{2})\\s(?<address>\\w+)\\s(?<city>\\w+)";
    private static final Pattern REGEX = Pattern.compile(REGEX_PATTERN);

    private final long id;
    private final String firstName;
    private final String lastName;
    private final Gender gender;
    private final String nationality;
    private final String birthdate;
    private final String address;
    private final City city;

    public static Person parse(String personInfo) {
        Matcher m = REGEX.matcher(personInfo);
        if (m.find()) {
            long id = Long.parseLong(m.group("id"));
            String firstName = m.group("firstname");
            String lastName = m.group("lastname");
            String birthdate = m.group("birthdate");
            Gender gender = Gender.parse(m.group("gender"));
            String nationality = m.group("nationality");
            City city = City.parse(m.group("city"));
            String address = m.group("address");
            return new Person(id, firstName, lastName, gender, nationality, birthdate, address, city);
        } else {
            return null;
        }
    }

    public Person(long id, String firstName, String lastName, Gender gender, String nationality, String birthdate, String address, City city) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.nationality = nationality;
        this.birthdate = birthdate;
        this.address = address;
        this.city = city;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public String getNationality() {
        return nationality;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getAddress() {
        return address;
    }

    public City getCity() {
        return city;
    }
}
