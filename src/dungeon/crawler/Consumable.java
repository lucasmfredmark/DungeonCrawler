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
public class Consumable extends Item {
    
    public Consumable(String name, String description, String type) {
        super.name = name;
        super.description = description;
        super.type = type;
    }
}
