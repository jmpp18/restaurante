package com.mycompany.restauranteuniversitario.food;

import com.mycompany.restauranteuniversitario.values.DishType;
import com.mycompany.restauranteuniversitario.values.CustomerRole;

public class Dish {

    private DishType type;
    private String name;
    private String ingredients; //TODO: convertir a lista
    private int price;
    private int quantity;

    public Dish(DishType type, String name, String ingredients, int price, int quantity) {
        this.type = type;
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.quantity = quantity;
    }

    public DishType getType() {
        return this.type;

    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void decreaseQuantity() {
        this.quantity = quantity - 1;
    }

    public String getHour() {
        return this.type == DishType.BREAKFAST ? "7:00 AM - 9:00 AM" : this.type == DishType.LUNCH ? "11:00 AM - 1:00 PM" : "5:00 pm - 7:00 PM";
    }

}
