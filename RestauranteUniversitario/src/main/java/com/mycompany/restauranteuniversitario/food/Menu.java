package com.mycompany.restauranteuniversitario.food;

import com.mycompany.restauranteuniversitario.values.DishType;
import java.util.ArrayList;

public class Menu {

    private ArrayList<Dish> dishList;

    public Menu() {

        this.dishList = new ArrayList<>();

    }

    public Menu(ArrayList<Dish> dishlist) {
        this.dishList = dishlist;
    }

    public void addDish(Dish dish) {

        this.dishList.add(dish);
    }

    public ArrayList<String> getDishesPerType(DishType dishType) {
        ArrayList<String> foundDishes = new ArrayList<>();

        for (Dish dish : dishList) {
            if (dish.getType() == dishType && dish.getQuantity() > 0) {
                foundDishes.add(dish.getName());
            }

        }
        return foundDishes;
    }

    public void showMenu() {
        for (DishType dishType : DishType.values()) {
            checkDishAmout("" + dishType, getDishesPerType(dishType));

        }
    }

    void checkDishAmout(String output, ArrayList<String> arrayToPrint) {

        if (!arrayToPrint.isEmpty()) {
            System.out.println(output);
            System.out.println(arrayToPrint);
        } else {
            System.out.println("no hay " + output);
        }

    }
}
