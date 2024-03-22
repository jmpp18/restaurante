package com.mycompany.restauranteuniversitario;

import com.mycompany.restauranteuniversitario.customer.Customer;
import com.mycompany.restauranteuniversitario.food.Dish;
import com.mycompany.restauranteuniversitario.food.Menu;
import com.mycompany.restauranteuniversitario.values.CustomerRole;
import com.mycompany.restauranteuniversitario.values.DishType;

public class RestauranteUniversitario {

    public static void main(String[] args) {
        Customer student = new Customer(CustomerRole.STUDENT, "192229", "Andres Felipe");
        Customer teacher = new Customer(CustomerRole.TEACHER, "192348", "Juan Manuel");
        Customer student2 = new Customer(CustomerRole.ADMINISTRATIVE, "192345", "Sofia Lopez");
        Menu menu = new Menu();

        Dish breakfast1 = new Dish(DishType.BREAKFAST, "huevos fritos", "huevos, sal y pimienta", 2500, 20);
        Dish breakfast2 = new Dish(DishType.BREAKFAST, "caldo", "carne, sal y papa", 2500, 20);
        Dish lunch1 = new Dish(DishType.LUNCH, "pastas a la boloñesa", "carne, pasta y tomate", 2500, 20);

        menu.addDish(breakfast1);
        menu.addDish(breakfast2);
        menu.addDish(lunch1);
        System.out.println(menu.getDishesPerType(DishType.BREAKFAST));
        System.out.println(teacher.getDishPrize(lunch1));
        System.out.println(student.getDishPrize(lunch1));
        System.out.println(student2.getDishPrize(lunch1));
        menu.showMenu();
        teacher.buyFood(breakfast2);
    }
}
