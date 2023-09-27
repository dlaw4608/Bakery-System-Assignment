package com.example.bakerysystem;

import com.example.bakerysystem.ADT.LinkList;
import com.example.bakerysystem.Models.BakedGoods;
import com.example.bakerysystem.Models.Ingredients;
import com.example.bakerysystem.Models.Recipe;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static LinkList<BakedGoods> bakedGoods = new LinkList<>();
    public static BakedGoods selectedBakedGood = null;
    public static Ingredients selectedIngredient;
    public static Recipe selectedRecipe;
    public static LinkList<Ingredients> ingredients = new LinkList<>();
    public static LinkList<Recipe> recipes = new LinkList<>();


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("master-version3.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640, 480);
        stage.setTitle("Welcome to Bakery");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}