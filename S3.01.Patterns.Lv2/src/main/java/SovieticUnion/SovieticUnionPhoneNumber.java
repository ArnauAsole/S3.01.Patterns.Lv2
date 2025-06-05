package SovieticUnion;

import Interfaces.PhoneNumber;

public class SovieticUnionPhoneNumber implements PhoneNumber {
    private final String number;

    public SovieticUnionPhoneNumber(String number) {
        this.number = number;
    }

    public String getInternationalNumber() {
        return "+7 " + number;
    }
}
