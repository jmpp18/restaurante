package com.mycompany.restauranteuniversitario;
import com.mycompany.restauranteuniversitario.customer.Customer;
import com.mycompany.restauranteuniversitario.food.Dish;
import com.mycompany.restauranteuniversitario.food.Menu;
import com.mycompany.restauranteuniversitario.values.CustomerRole;
import com.mycompany.restauranteuniversitario.values.DishType;

public class RestauranteUniversitario {

    public static void main(String[] args) {
        Customer student = new Customer(CustomerRole.STUDENT, "192229", "Andres Felipe");
        Customer student2 = new Customer(CustomerRole.ADMINISTRATIVE, "192229", "Andres Felipe");
        student.sellFood();
        student2.sellFood();
        
        Menu menu = new Menu();
        
        Dish breakfast1 = new Dish(DishType.BREAKFAST,"huevos fritos","huevos, sal y pimienta",2500,20);
        Dish breakfast2 = new Dish(DishType.BREAKFAST,"caldo","carne, sal y papa",2500,20);
        Dish lunch1 = new Dish(DishType.LUNCH,"pastas a la boloñesa","carne, pasta y tomate",2500,20);

        
        menu.addDish(breakfast1);
        menu.addDish(breakfast2);
        menu.addDish(lunch1);
        System.out.println(menu.getDishesPerType(DishType.BREAKFAST));
        
    }
}
