/*package com.example.bakerysystem.Controllers;

import com.example.bakerysystem.Main;
import com.example.bakerysystem.Models.BakedGoods;
import com.example.bakerysystem.Models.Ingredients;
import com.example.bakerysystem.Models.Recipe;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class MasterController {
    /**
     * BakedGoods
     **//*
    @FXML
    TextField nameId, origin, textDescription;
    @FXML
    public ListView<BakedGoods> bakedGoodsListView;

    public void addBakedGoods(ActionEvent actionEvent) {
        String id = nameId.getText();
        String org = origin.getText();
        String des = textDescription.getText();

        BakedGoods bakedGood = new BakedGoods(id, org, des);
        Main.bakedGoods.addElement(bakedGood);

        System.out.println(Main.bakedGoods.getHead());
        populateBakedGoodsListView();

    }

    public void populateBakedGoodsListView() {
        bakedGoodsListView.getItems().clear();
        Main.bakedGoods.addContentsToListView(bakedGoodsListView);
    }

    public void removeBakedGoods(){
        int i = 0;
        Main.bakedGoods.removeElement(i);
        populateRecipeListView();
    }
    /**
     * Ingredients
     **/
/*
    @FXML
    public TextField IngredientName, IngredientDescription, Calories;

    @FXML
    public ListView<Ingredients> ingredientsListView;

    @FXML
    public ComboBox<BakedGoods> bakedGoodCmBoBx;

   /* public void addIngredients(ActionEvent actionEvent) {
        String IngredientID = IngredientName.getText();
        String IngredientDes = IngredientDescription.getText();
        String Cals = Calories.getText();

        Ingredients ingredient = new Ingredients(IngredientID, IngredientDes, Cals);
        Main.selectedBakedGood = bakedGoodCmBoBx.getSelectionModel().getSelectedItem();
        if (Main.selectedBakedGood != null) {
            Main.selectedBakedGood.ingredients.addElement(ingredient);
            System.out.println(Main.selectedBakedGood.ingredients.getHead());

            populateIngredientsListView();
            populateComboBox();
        }
    }

    public void updateBakedGoods() {
        System.out.println(bakedGoodsListView.getSelectionModel().getSelectedItem() + "\n" );
    }
/*public void addIngredients(ActionEvent actionEvent) {
    String IngredientID = IngredientName.getText();
    String IngredientDes = IngredientDescription.getText();
    String Cals = Calories.getText();


    Ingredients ingredient = new Ingredients(IngredientID, IngredientDes, Cals);
    Main.ingredients.addElement(ingredient);

    System.out.println(Main.ingredients.getHead());
    populateIngredientsListView();


}*/
/*
    public void populateIngredientsListView() {
        ingredientsListView.getItems().clear();
        Main.selectedBakedGood.ingredients.addContentsToListView(ingredientsListView);
        Main.ingredients.addContentsToListView(ingredientsListView);
    }

    public void populateComboBox() {
        bakedGoodCmBoBx.getItems().clear();
        Main.bakedGoods.addContentsToComboBox(bakedGoodCmBoBx);
    }

    public void removeIngredient(){
        int i = 0;
        Main.selectedBakedGood.ingredients.removeElement(i);
        populateRecipeListView();
    }

/**Recipe**/
    /*
@FXML
public ComboBox<BakedGoods> recipeBakedGoodCB;
@FXML
public ComboBox<Ingredients> recipeIngredientsCB;
@FXML
public TextField recipeName;
@FXML
public TextField amount;
@FXML
public ListView<Recipe> recipeListView;

public void addRecipe(ActionEvent actionEvent){
   String RecipeName = this.recipeName.getText();
   double quantity = Double.parseDouble(this.amount.getText());

    Recipe recipe = new Recipe(RecipeName,quantity);
    Main.selectedBakedGood = recipeBakedGoodCB.getSelectionModel().getSelectedItem();
    Main.selectedIngredient = recipeIngredientsCB.getSelectionModel().getSelectedItem();
    if(Main.selectedIngredient != null){
        Main.selectedIngredient.recipe.addElement(recipe);
        populateRecipeListView();
        populateRecipeComBox();
    }
}

public void populateRecipeComBox(){
   // recipeBakedGoodCB.getItems().clear();
    recipeIngredientsCB.getItems().clear();
    Main.bakedGoods.addContentsToComboBox(recipeBakedGoodCB);
  //  Main.ingredients.addContentsToComboBox(recipeIngredientsCB);
}
public void populateRecipeListView(){
    recipeListView.getItems().clear();
    Main.selectedBakedGood.ingredients.addContentsToListView(recipeListView);
}
public void click(){
    Main.selectedBakedGood = recipeBakedGoodCB.getSelectionModel().getSelectedItem();
    recipeIngredientsCB.getItems().clear();
    Main.selectedBakedGood.ingredients.addContentsToComboBox(recipeIngredientsCB);
}
public void removeRecipe(){
     int i = 0;
        Main.selectedIngredient.recipe.removeElement(i);
        populateRecipeListView();
}

}*/