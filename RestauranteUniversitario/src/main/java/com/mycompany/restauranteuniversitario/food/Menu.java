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

    public ArrayList<Dish> getDishesPerType(DishType dishType) {
        ArrayList<Dish> foundDishes = new ArrayList<>();

        for (Dish dish : dishList) {
            if (dish.getType() == dishType) {
                foundDishes.add(dish);
            }

        }
        return foundDishes;
    }
}
