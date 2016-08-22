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
public class Valuable extends Item {
    private int value;
    
    public Valuable(int value, String name, String description) {
        this.value = value;
        super.name = name;
        super.description = description;
    }
}
