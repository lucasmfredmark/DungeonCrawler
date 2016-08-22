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
public class Weapon extends Item {
    
    public Weapon(int damage, String name, String description, String type) {
        this.damage = damage;
        super.name = name;
        super.description = description;
        super.damage = damage;
        super.type = type;
    }
    
    public int getDamage(){
        return this.damage;
    }
    
    public void setDamage(int damage){
        this.damage = damage;
    }
}
