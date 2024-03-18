package com.mycompany.restauranteuniversitario;

import customer.Customer;
import food.Dish;
import values.CustomerRole;

public class RestauranteUniversitario {

    public static void main(String[] args) {
        Customer student = new Customer(CustomerRole.STUDENT, "192229", "Andres Felipe");
        Customer student2 = new Customer(CustomerRole.ADMINISTRATIVE, "192229", "Andres Felipe");
        student.sellFood();
        student2.sellFood();
    }
}
