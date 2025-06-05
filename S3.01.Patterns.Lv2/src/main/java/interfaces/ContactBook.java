package interfaces;

public interface ContactBook {
    Address createAddress(String street, String city, String postalCode);
    PhoneNumber createPhoneNumber(String number);
}