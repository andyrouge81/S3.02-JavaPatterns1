package level2.concreteProducts;

import level2.abstractProducts.Address;

public class UsaAddress implements Address {

    private String address;
    private String city;
    private String zipCode;

    public UsaAddress(String address, String city, String zipCode) {
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String format(){
        return address+", "+city+", "+zipCode;
    }
}
