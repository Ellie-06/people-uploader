package domain;

public enum Gender {
    FEMALE,MALE,NEUTRAL;

    public static Gender parse(String value) {
        String v = value.toLowerCase();
        if (v.equals("f")) {
            return Gender.FEMALE;
        } if (v.equals("m")) {
            return Gender.MALE;
        } if (v.equals("n")) {
            return Gender.NEUTRAL;
        } else {
            return null;
        }
    }
}
