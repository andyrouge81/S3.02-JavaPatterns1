package level2.concreteFactory;

import level2.concreteProducts.SpainAddress;
import level2.concreteProducts.SpainPhone;
import level2.abstractProducts.Address;
import level2.abstractFactory.ContactFactory;
import level2.abstractProducts.Phone;

public class SpainContactFactory implements ContactFactory {

    private String address;
    private String city;
    private String zipCode;
    private String phoneNumber;

    public SpainContactFactory(String address, String city, String zipCode, String phoneNumber) {
        this.address = address.trim();
        this.city = city.trim();
        this.zipCode = zipCode.trim();
        this.phoneNumber = phoneNumber.trim();
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public Address createAddress(){
        return new SpainAddress(address, city, zipCode);
    }

    @Override
    public Phone createPhone(){
        return new SpainPhone(getPhoneNumber());
    }

    @Override
    public String toString() {
        return "SpainContactFactory{" +
                "address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
