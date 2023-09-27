package com.example.bakerysystem.Models;


import com.example.bakerysystem.ADT.LinkList;

public class BakedGoods {
       // public LinkList<Ingredients> ingredients = new LinkList<>();
    //public LinkList<Recipe> recipes = new LinkList<>();
        private String bakedGoodsName;
        private String countryOfOrigin;
        private String textDescription;
        //Dont forget image

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getBakedGoodsName() {
        return bakedGoodsName;
    }

    public void setBakedGoodsName(String bakedGoodsName) {
        this.bakedGoodsName = bakedGoodsName;
    }

    public BakedGoods(String bakedGoodsName, String countryOfOrigin, String textDescription){
            this.bakedGoodsName = bakedGoodsName;
            this.countryOfOrigin = countryOfOrigin;
            this.textDescription = textDescription;
        }


       /* public LinkList<Ingredients> getIngredients() {
            return ingredients;
        }

        public void setIngredients(LinkList<Ingredients> ingredients) {
            this.ingredients = ingredients;
        }*/

        @Override
        public String toString() {
            return "BakedGoods{" +
                    //"ingredients=" + ingredients +
                    ", bakedGoodsName='" + bakedGoodsName + '\'' +
                    ", countryOfOrigin='" + countryOfOrigin + '\'' +
                    ", textDescription='" + textDescription + '\'' +
                    '}';
        }
    }


