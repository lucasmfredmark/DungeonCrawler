/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon.crawler;

/**
 *
 * @author Orvur
 */
public class Room {
    private int id;
    private String description;
    private Room north;
    private Room east;
    private Room west;
    private Room south;
    private Item item;
    private Monster monster;
    
    public Room(int id, String description, Item item, Monster monster) {
        this.id = id;
        this.description = description;
        this.item = item;
        this.monster = monster;
    }
    
    public void setRoom(int id, String description, Item item, Monster monster){
        this.id = id;
        this.description = description;
        this.item = item;
        this.monster = monster;
    }
    
    public int getId() {
        return id;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setNorth(Room north) {
        this.north = north;
    }
    
    public void setEast(Room east) {
        this.east = east;
    }
    
    public void setWest(Room west) {
        this.west = west;
    }
    
    public void setSouth(Room south) {
        this.south = south;
    }
    
    public Room getNorth() {
        return north;
    }

    public Room getEast() {
        return east;
    }

    public Room getWest() {
        return west;
    }

    public Room getSouth() {
        return south;
    }
    
    public Item getItem() {
        return this.item;
    }
    
    public void setItem(Item item) {
        this.item = item;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }
}
