package com.game.model;

import com.game.model.Item;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private String description;
    private List<Item> items;
    private Location currentLocation;

    public Player(String name, String description) {
        this.name = name;
        this.description = description;
        items = new ArrayList<>();
        items.add(new Item("key"));
    }

    public Player() {
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
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

    @Override
    public String toString() {
        return name;
    }
}
