package level2.concreteProducts;

import level2.abstractProducts.Address;


public class SpainAddress implements Address {
    private String address;
    private String city;
    private String zipCode;

    public SpainAddress(String address, String city, String zipCode) {
        this.address = address;
        this.city = city;
        this.zipCode = zipCode;
    }

    @Override
    public String format(){
        return address+ ", "+city+", "+zipCode;

    }
}
