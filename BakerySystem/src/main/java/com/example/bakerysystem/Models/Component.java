package com.example.bakerysystem.Models;

public class Component {
    Ingredients theIngredient;
    double quantity;

    public Component(Ingredients theIngredient, double quantity){
        this.theIngredient = theIngredient;
        this.quantity = quantity;
    }

    public Ingredients getTheIngredient() {
        return theIngredient;
    }

    public void setTheIngredient(Ingredients theIngredient) {
        this.theIngredient = theIngredient;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Component{" +
                "theIngredient=" + theIngredient +
                ", quantity=" + quantity +
                '}';
    }
}
