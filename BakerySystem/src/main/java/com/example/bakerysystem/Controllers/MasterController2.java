package com.example.bakerysystem.Controllers;

import com.example.bakerysystem.ADT.LinkList;
import com.example.bakerysystem.ADT.LinkNode;
import com.example.bakerysystem.Main;
import com.example.bakerysystem.Models.BakedGoods;
import com.example.bakerysystem.Models.Component;
import com.example.bakerysystem.Models.Ingredients;
import com.example.bakerysystem.Models.Recipe;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class MasterController2 {
    /**
     * BakedGoods
     **/
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
    //this is getting the chosen object in the list view and allowing user ti update the fields.
    public void onClickUpdate(){
        //original // BakedGoods chosen = searchView.getSelectionModel().getSelectedItem();
        BakedGoods chosen = bakedGoodsListView.getSelectionModel().getSelectedItem();

        chosen.setBakedGoodsName(nameId.getText());
        chosen.setCountryOfOrigin(origin.getText());
        chosen.setTextDescription(textDescription.getText());
        populateBakedGoodsListView();
    }

 /*public void updateBakedGoods() {
        System.out.println(bakedGoodsListView.getSelectionModel().getSelectedItem() + "\n" );
    }*/
    /**
     * Ingredients
     **/

    @FXML
    public TextField IngredientName, IngredientDescription, Calories;

    @FXML
    public ListView<Ingredients> ingredientsListView;

   /* @FXML
    public ComboBox<BakedGoods> bakedGoodCmBoBx;*/

    /*public void addIngredients(ActionEvent actionEvent) {
        String IngredientID = IngredientName.getText();
        String IngredientDes = IngredientDescription.getText();
        String Cals = Calories.getText();

        Ingredients ingredient = new Ingredients(IngredientID, IngredientDes, Cals);
        //Main.selectedBakedGood = bakedGoodCmBoBx.getSelectionModel().getSelectedItem();
        if (Main.selectedBakedGood != null) {
            Main.selectedBakedGood.ingredients.addElement(ingredient);
            System.out.println(Main.selectedBakedGood.ingredients.getHead());

            populateIngredientsListView();
            //populateComboBox();
        }
    }*/


    public void addIngredients(ActionEvent actionEvent) {
        String IngredientID = IngredientName.getText();
        String IngredientDes = IngredientDescription.getText();
        String Cals = Calories.getText();


        Ingredients ingredient = new Ingredients(IngredientID, IngredientDes, Cals);
        Main.ingredients.addElement(ingredient);

        System.out.println(Main.ingredients.getHead());
        populateIngredientsListView();

    }

    /*public void updateBakedGoods() {
        System.out.println(bakedGoodsListView.getSelectionModel().getSelectedItem() + "\n" );
    }*/
/*public void addIngredients(ActionEvent actionEvent) {
    String IngredientID = IngredientName.getText();
    String IngredientDes = IngredientDescription.getText();
    String Cals = Calories.getText();


    Ingredients ingredient = new Ingredients(IngredientID, IngredientDes, Cals);
    Main.ingredients.addElement(ingredient);

    System.out.println(Main.ingredients.getHead());
    populateIngredientsListView();


}*/

    public void populateIngredientsListView() {
        ingredientsListView.getItems().clear();
        //Main.selectedBakedGood.ingredients.addContentsToListView(ingredientsListView);
        Main.ingredients.addContentsToListView(ingredientsListView);
    }

    /*public void populateComboBox() {
        bakedGoodCmBoBx.getItems().clear();
        Main.bakedGoods.addContentsToComboBox(bakedGoodCmBoBx);
    }
*/
    public void removeIngredient(){
        int i = 0;
        Main.ingredients.removeElement(i);
        populateRecipeListView();
    }

    /**Recipe**/
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
    @FXML
    public ListView<Recipe> componentListView;
    @FXML
    public TextArea recipeDescription;
    public LinkList<Component> theList = new LinkList<>();




    public void createRecipe(ActionEvent actionEvent){
        String recipeName = this.recipeName.getText();
        BakedGoods bakedG = this.recipeBakedGoodCB.getSelectionModel().getSelectedItem();
        LinkList<Component> theList = this.theList;
        String recipeDescription = this.recipeDescription.getText();

        Recipe recipe = new Recipe(recipeName,bakedG,theList,recipeDescription);
        Main.recipes.addElement(recipe);

        populateRecipeListView();

    }


    public void addComponent(ActionEvent actionEvent){
        Ingredients theIngredient = this.recipeIngredientsCB.getSelectionModel().getSelectedItem();
        double quantity = Double.parseDouble(this.amount.getText());



       Component component = new Component(theIngredient,quantity);
        //Recipe recipe = new Recipe(RecipeName,quantity);
       // Main.selectedBakedGood = recipeBakedGoodCB.getSelectionModel().getSelectedItem();

        //Main.selectedIngredient = recipeIngredientsCB.getSelectionModel().getSelectedItem();
        /*if(Main.selectedIngredient != null){
            Main.selectedIngredient.recipe.addElement(recipe);//

         */
        theList.addElement(component);
       // Main.recipes.addElement(recipe);

            populateComponentListView();
            //populateAmountComBox();
            populateRecipeComBox();
       // }
    }



   /* public void populateAmountComBox(){
         recipeBakedGoodCB.getItems().clear();
        recipeIngredientsCB.getItems().clear();
        Main.bakedGoods.addContentsToComboBox(recipeBakedGoodCB);
         Main.ingredients.addContentsToComboBox(recipeIngredientsCB);
    }
*/
    public void populateRecipeComBox(){
        recipeBakedGoodCB.getItems().clear();
        Main.bakedGoods.addContentsToComboBox(recipeBakedGoodCB);
        recipeIngredientsCB.getItems().clear();
        Main.ingredients.addContentsToComboBox(recipeIngredientsCB);
    }
    public void populateRecipeListView(){
        recipeListView.getItems().clear();
        Main.recipes.addContentsToListView(recipeListView);
    }

    public void populateComponentListView(){
        componentListView.getItems().clear();
        theList.addContentsToListView(componentListView);

    }
   /* public void click(){
        Main.selectedBakedGood = recipeBakedGoodCB.getSelectionModel().getSelectedItem();
        recipeIngredientsCB.getItems().clear();
        Main.selectedBakedGood.ingredients.addContentsToComboBox(recipeIngredientsCB);
    }*/
   /* public void removeRecipe(){
        int i = 0;
        Main.selectedIngredient.recipe.removeElement(i);
        populateRecipeListView();
    }*/

    /**Search**/
    @FXML
    public TextField goodSearch;


    public ListView searchView;
/*
    public void onClickSearch(ActionEvent actionEvent) {
        LinkNode<BakedGoods> bg = Main.bakedGoods.getHeadNode();
        searchView.getItems().clear();

        while (bg != null) {
            String str;
            LinkNode<Ingredients> ing = bg.getContents().ingredients.getHeadNode();
            while (ing != null) {
                if (ing.getContents().getIngredientName().contains(goodSearch.getText())) {
                    str = bg.getContents().getTextDescription() + ing.getContents().getTextDescription();
                    searchView.getItems().add(str);


                    LinkNode<Recipe> re = ing.getContents().recipe.getHeadNode();
                    while (re != null) {
                        if (re.getContents().getRecipeName().contains(goodSearch.getText())) {
                            str = bg.getContents().getTextDescription() + ing.getContents().getTextDescription() + re.getContents().getRecipeName();
                            searchView.getItems().add(str);
                        }
                        re = re.next;
                    }

                    ing = ing.next;
                }
                bg = bg.next;
            }

        }
    }

 *//*
//this search method looking for name strings uses the list iterator class
//to iterate through each list acting as our for loop
public void onClickSearchName() {
    searchView.getItems().clear();

    String str;
    for (BakedGoods bg : Main.bakedGoods) {
        if (bg.getBakedGoodsName().equals(goodSearch.getText())) {
            str = bg.getBakedGoodsName();
            searchView.getItems().clear();
        }

        for (Ingredients ing : bg.ingredients) {
            if (ing.getIngredientName().equals(goodSearch.getText())) {
                str = ing.getIngredientName();
                searchView.getItems().clear();
            }

        }
    }
}
*/
}
