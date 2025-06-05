package manager;

import Interfaces.Address;
import Interfaces.PhoneNumber;

public class ContactManager {
    private final Address address;
    private final PhoneNumber phoneNumber;

    public ContactManager(Address address, PhoneNumber phoneNumber) {
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void showContact() {
        System.out.println("Address: " + address.getFullAddress());
        System.out.println("Phone: " + phoneNumber.getInternationalNumber());
    }
}
