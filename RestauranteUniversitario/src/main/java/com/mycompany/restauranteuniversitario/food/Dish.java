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

  public DishType getType(){
  return this.type;
  
  }
    
    
}
