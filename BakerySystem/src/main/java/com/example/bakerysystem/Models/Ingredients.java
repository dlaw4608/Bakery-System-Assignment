package com.example.bakerysystem.Models;

import com.example.bakerysystem.ADT.LinkList;

public class Ingredients {
   // public LinkList<Recipe> recipe = new LinkList<>();
    private String ingredientName;
    private String textDescription;
    private String calories;

    public Ingredients(String ingredientName, String textDescription, String calories) {
        this.ingredientName = ingredientName;
        this.textDescription = textDescription;
        this.calories = calories;

    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    /* public LinkList<Recipe> getRecipe() {
                    return recipe;
                }

                public void setRecipe(LinkList<Recipe> recipe) {
                    this.recipe = recipe;
                }
            */
    @Override
    public String toString() {
        return "Ingredients{" +
               // "recipe=" + recipe +
                ", ingredientName='" + ingredientName + '\'' +
                ", textDescription='" + textDescription + '\'' +
                ", calories='" + calories +",cal" + '\'' +
                '}';
    }
}
