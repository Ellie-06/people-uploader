package domain;

public enum City {

    KABUL, TIRANA, ALGIERS, ANDORRA_LA_VELLA, LUANDA, SAINT_JOHNS, BUENOS_AIRES, YEREVAN, CANBERRA, VIENNA, BAKU, PRAGUE;

    public static City parse(String value) {
        if (value.contains(" ")) {
            value = value.replaceAll(" ", "_");
        }

        value = value.toUpperCase();
        return valueOf(value);
    }
}