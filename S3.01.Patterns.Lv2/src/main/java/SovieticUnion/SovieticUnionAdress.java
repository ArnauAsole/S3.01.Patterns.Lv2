package SovieticUnion;


import Interfaces.Address;

public class SovieticUnionAddress implements Address {
    private final String street, city, postalCode;

    public SovieticUnionAddress(String street, String city, String postalCode) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getFullAddress() {
        return street + ", " + postalCode + " " + city + ", USSR";
    }
}