package com.mycompany.restauranteuniversitario.customer;

import com.mycompany.restauranteuniversitario.food.Dish;
import com.mycompany.restauranteuniversitario.values.CustomerRole;

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

    public int getDishPrize(Dish dish) {
        if (this.role != CustomerRole.STUDENT) {
            return 7000;
        } else {
            return dish.getPrice();
        }
    }
    public void buyFood(Dish dish){
     if(dish.getQuantity()>0){
         dish.decreaseQuantity();
         System.out.println("plato de "+dish.getName()+" vendido a $"+getDishPrize(dish));
         System.out.println("ven entre las "+dish.getHour());
     }
     else{
         System.out.println("no hay mas platos");
     }
    
    }
}
