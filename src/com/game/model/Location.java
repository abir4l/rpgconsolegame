package com.game.model;
import java.util.List;

public class Location {

    private String description;
    private String name;
    private List<Item> items;

    public Location(){

    }
    public Location(String description,String name) {
        this.description = description;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
