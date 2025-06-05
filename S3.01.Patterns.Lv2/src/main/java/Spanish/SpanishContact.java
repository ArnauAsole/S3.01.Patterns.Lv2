package Spanish;


import Interfaces.Address;
import Interfaces.ContactBook;
import Interfaces.PhoneNumber;

public class SpanishContact implements ContactBook {
    public Address createAddress(String street, String city, String postalCode) {
        return new SpanishAddress(street, city, postalCode);
    }

    public PhoneNumber createPhoneNumber(String number) {
        return new SpanishPhoneNumber(number);
    }
}