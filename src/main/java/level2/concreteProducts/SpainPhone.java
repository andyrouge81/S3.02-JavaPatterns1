package level2.concreteProducts;

import level2.abstractProducts.Phone;

public class SpainPhone implements Phone {

    private String phoneNumber;

    public SpainPhone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String format(){
       return " +34 "+phoneNumber;
    }


}
