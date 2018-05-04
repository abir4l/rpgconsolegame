package com.game.model;

public class Item {


    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void useItem(){

    }

    @Override
    public String toString() {
        return "\t"+name;
    }
}
