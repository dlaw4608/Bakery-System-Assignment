package com.example.bakerysystem.Models;

import com.example.bakerysystem.ADT.LinkList;

public class Recipe {
    private String recipeName;
    //private double quantity;

    BakedGoods bakedG;
    LinkList<Component> componentLinkList;
    String recipeDes;


    public Recipe(String recipeName, BakedGoods bakedG, LinkList<Component> componentLinkList, String recipeDes) {
        this.recipeName = recipeName;
        this.bakedG = bakedG;
        this.componentLinkList = componentLinkList;
        this.recipeDes = recipeDes;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public BakedGoods getBakedG() {
        return bakedG;
    }

    public void setBakedG(BakedGoods bakedG) {
        this.bakedG = bakedG;
    }

    public LinkList<Component> getComponentLinkList() {
        return componentLinkList;
    }

    public void setComponentLinkList(LinkList<Component> componentLinkList) {
        this.componentLinkList = componentLinkList;
    }

    public String getRecipeDes() {
        return recipeDes;
    }

    public void setRecipeDes(String recipeDes) {
        this.recipeDes = recipeDes;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "recipeName='" + recipeName + '\'' +
                ", bakedG=" + bakedG +
                ", componentLinkList=" + componentLinkList +
                ", recipeDes='" + recipeDes + '\'' +
                '}';
    }
}
