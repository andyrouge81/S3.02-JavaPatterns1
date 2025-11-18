package level2.concreteFactory;

import level2.concreteProducts.UsaAddress;
import level2.concreteProducts.UsaPhone;
import level2.abstractFactory.ContactFactory;

public class USAContactFactory implements ContactFactory {

    private String address;
    private String city;
    private String zipCode;
    private String phoneNumber;

    public USAContactFactory(String address, String city, String zipCode, String phoneNumber){
        this.address = address.trim();
        this.city = city.trim();
        this.zipCode = zipCode.trim();
        this.phoneNumber = phoneNumber.trim();
    }



    @Override
    public UsaAddress createAddress(){
        return new UsaAddress(address, city, zipCode);
    }


    @Override
    public UsaPhone createPhone(){
        return new UsaPhone(phoneNumber);

    }

    @Override
    public String toString() {
        return "USAContactFactory{" +
                "address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
