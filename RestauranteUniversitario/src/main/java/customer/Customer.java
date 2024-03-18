package customer;

import values.CustomerRole;

public class Customer {

    // ALT + ENTER para importación automática
    CustomerRole role;
    String id;
    String fullName;

    public Customer(CustomerRole role, String id, String fullName) {
        this.role = role;
        this.id = id;
        this.fullName = fullName;
    }

    void sayMenu() {
    }

    void buyFood() {
    }

    void cancelBuy() {
    }

    public void sellFood() {
        if (this.role != CustomerRole.ADMINISTRATIVE) {
            System.out.println("You can't sell food.");
        } else {
            System.out.println("Hola");
        }
    }

}
