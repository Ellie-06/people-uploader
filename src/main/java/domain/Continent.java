package domain;

public enum  Continent {

    AFRICA, EUROPE, NORTH_AMERICA, SOUTH_AMERICA, ASIA, AUSTRALIA, OCEANIA;

    public static Continent parse(String value) {
        String v = value.toLowerCase();
        if (v.equals("africa")) {
            return Continent.AFRICA;
        } if (v.equals("europe")) {
            return Continent.EUROPE;
        } if (v.equals("north america")) {
            return Continent.NORTH_AMERICA;
        } if (v.equals("south america")) {
            return Continent.SOUTH_AMERICA;
        } if (v.equals("asia")) {
            return Continent.ASIA;
        } if (v.equals("australia")) {
            return Continent.AUSTRALIA;
        } if (v.equals("oceania")) {
            return Continent.OCEANIA;
        } else {
            return null;
        }
    }

}
