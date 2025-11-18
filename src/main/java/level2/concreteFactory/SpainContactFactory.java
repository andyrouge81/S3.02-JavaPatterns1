package level2.concreteFactory;

import level2.concreteProducts.SpainAddress;
import level2.concreteProducts.SpainPhone;
import level2.abstractFactory.ContactFactory;


public class SpainContactFactory implements ContactFactory {

    private String address;
    private String city;
    private String zipCode;
    private String phoneNumber;

    public SpainContactFactory(String address, String city, String zipCode, String phoneNumber) {
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {

        return phoneNumber;
    }

    @Override
    public SpainAddress createAddress(){

        return new SpainAddress(address, city, zipCode);
    }

    @Override
    public SpainPhone createPhone(){

        return new SpainPhone(phoneNumber);
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
