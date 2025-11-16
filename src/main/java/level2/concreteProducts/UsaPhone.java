package level2.concreteProducts;

import level2.abstractProducts.Phone;

public class UsaPhone implements Phone {

    private String phoneNumber;

    public UsaPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String format(){
        return " +1 "+phoneNumber;
    }
}
