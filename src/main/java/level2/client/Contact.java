package level2.client;

import level2.abstractProducts.Address;
import level2.abstractProducts.Phone;
import level2.abstractFactory.ContactFactory;

public class Contact {

    private Address address;
    private Phone phone;

    public Contact(ContactFactory factory){
        address = factory.createAddress();
        phone = factory.createPhone();
    }


    @Override
    public String toString() {
        return "Address: "+address.format()+" | Phone: "+phone.format();
    }
}
