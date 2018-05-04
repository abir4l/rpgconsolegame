package com.game.main;

import com.game.model.Item;
import com.game.model.Location;
import com.game.model.Player;

import java.util.*;

public class Game {

    List<Player> heros = new ArrayList<>();
    List<Location> locations = new ArrayList<>();
    Player selectedHero = null;
    int exit=0;

    public Game() {

        configurePLayers();
        configureLocations();



    }

    private void configureLocations() {



        Location hallway = new Location("As you enter the door, a big dark hallway stands in front of you.","The Hall way");
        List<Item> hallwayItems = new ArrayList<>();
        hallwayItems.add(new Item("A iron chain"));
        hallwayItems.add(new Item("Sword"));
        hallwayItems.add(new Item("Crossbow"));

        Location door = new Location("A large door stands in front of  you","The Door");
        List<Item> doorItems = new ArrayList<>();
        doorItems.add(new Item("Door Handle"));
        doorItems.add(new Item("Key Hole"));
        door.setItems(doorItems);
        locations.add(door);
        locations.add(hallway);

    }

    private void configurePLayers() {

        Player paladin = new Player("Paladin",
                "A mighty knight with magical offence and defence powers");
        Player sorcerer = new Player("Sorcerer",
                "Magic spell bound hero that can use fire,ice,water and wind sorcery");
        Player necromancer = new Player("Necromancer",
                "Dancing with the dead skeletons and golems, this hero brings back the dead to fight for him");
        heros.add(paladin);
        heros.add(sorcerer);
        heros.add(necromancer);


    }


    public void run() {

        welcomeMessage();
        selectedHero = selectHero();
        System.out.println("You Selected:: ");
        System.out.println("\t"+selectedHero.getName().toUpperCase());
        selectedHero.setCurrentLocation(locations.get(0));
        locationInfo(selectedHero.getCurrentLocation());
        while(exit != -1){
            Scanner sc = new Scanner(System.in);
            System.out.println("What do you like to do???");
            sc.nextLine();

        }
    }


    public void showHeroes() {
        for (int i = 0; i < heros.size(); i++) {
            System.out.println((i + 1) + ". " + heros.get(i));
        }
    }



    public Player selectHero(){

        int choice = 0;
        char confirm = 'N';
        while (Character.toLowerCase(confirm) != 'y') {

            System.out.println("\nSelect your hero. ");
            showHeroes();
            while (choice == 0 || choice > 3) {

                try {
                    Scanner sc = new Scanner(System.in);
                    choice = sc.nextInt();
                    if (choice > 3 || choice < 1) {
                        System.out.println("Please enter valid number from the list of heroes");
                    }
                    printNewLines();
                } catch (InputMismatchException ex) {

                    System.out.println("Please input a valid number");
                }
            }

            System.out.println(heros.get(choice - 1).getName());
            System.out.println(heros.get(choice - 1).getDescription());
            System.out.println("\nConfirm your hero..(Y/N)::");
            Scanner sc = new Scanner(System.in);
            confirm = sc.next().charAt(0);
            if(Character.toLowerCase(confirm)!= 'y')choice=0;
        }

        return heros.get(choice-1);
    }

    public void printNewLines(){
        System.out.println("\n\n");
    }

    public void welcomeMessage(){

        System.out.println("**********************************************");
        System.out.println("*                                            *");
        System.out.println("*         Heroes Saga, A RPG GAME            *");
        System.out.println("*                                            *");
        System.out.println("**********************************************");
    }

    public void locationInfo(Location location){

        System.out.println(String.format("\nYou are currently at %s",location.getName()));
        System.out.println("Around the place you see:: ");
        location.getItems().forEach(System.out::println);
    }
}
