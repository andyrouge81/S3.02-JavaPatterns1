package level2.abstractFactory;

import level2.abstractProducts.Address;
import level2.abstractProducts.Phone;

public interface ContactFactory {
    Address createAddress();
    Phone createPhone();
}
