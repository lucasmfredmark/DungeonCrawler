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
public class Item {
    public String name;
    public String description;
    public int damage;
    public String type;
    
    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public int getDamage() {
        return damage;
    }
    
    public void setDamage(int damage){
        this.damage = damage;
    }
    
    public String getType() {
        return type;
    }
}
