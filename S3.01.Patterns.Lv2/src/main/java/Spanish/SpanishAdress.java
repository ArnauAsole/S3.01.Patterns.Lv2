package Spanish;

import Interfaces.Address;

public class SpanishAddress implements Address {
    private final String street, city, postalCode;

    public SpanishAddress(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getFullAddress() {
        return street + ", " + postalCode + " " + city + ", Espanya";
    }
}
