/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon.crawler;

import java.util.Random;

/**
 *
 * @author Orvur
 */
public class Monster {
    private String name;
    private int hitPoints;
    private int damage;
    private String description;
    private int expWorth;
    private boolean onFire = false;
    Random ran = new Random();
    
    public Monster(String name, int hitPoints, int damage, String description, int exp) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
        this.description = description;
        this.expWorth = exp;
    }
    
    /**
     * Decides if the monster is dead or if it should attack.
     * @param player
     * @param map
     * @param i
     * @return 
     */
    public String act(Player player, Map map, int i){
        if(map.getCurrentRoom().getMonster().getHitPoints() <= 0)
            return dead(player, map);
        else return attack(player, map, i);
        
    }
    
    /**
     * Decides if the monster crits or does a normal attack.
     * @param player
     * @param map
     * @param i
     * @return 
     */
    public String attack(Player player, Map map, int i){
        if(i == 0)
            return crit(player, map);
        else return hit(player, map);
    }
    
    /**
     * Makes the monster attack the player for double damage.
     * @param player
     * @param map
     * @return 
     */
    public String crit(Player player, Map map){
        player.setHitPoints(player.getHitPoints() - this.damage * 2);
        return map.getCurrentRoom().getMonster().getName() + " crits you for " + (map.getCurrentRoom().getMonster().getDamage() * 2) + " damage.\n\n"
                     + "Player HP: " + player.getHitPoints() + "\n"
                     + "Monster HP: " + map.getCurrentRoom().getMonster().getHitPoints();
    }
    
    /**
     * Makes the monster attack the player.
     * @param player
     * @param map
     * @return 
     */
    public String hit(Player player, Map map){
        player.setHitPoints(player.getHitPoints() - this.damage);
        return map.getCurrentRoom().getMonster().getName() + " hits you back for " + map.getCurrentRoom().getMonster().getDamage() + " damage.\n\n"
                     + "Player HP: " + player.getHitPoints() + "\n"
                     + "Monster HP: " + map.getCurrentRoom().getMonster().getHitPoints();
    }
    
    /**
     * Checks if the monster has been hit by a fireball,
     * if it has, makes the monster take damage.
     * @return 
     */
    public String OnFire(){
        if(onFire == true){
        this.setHitPoints(this.getHitPoints() - 1);
        return "The " + this.getName() + " is on fire and takes 1 damage.\n";
        }
        return "";
    }
    
    /**
     * Makes the monster die and gives the player experience and in some cases a level.
     * @param player
     * @param map
     * @return 
     */
    public String dead(Player player, Map map){
        map.getCurrentRoom().setMonster(null);
        if(player.getExp() + expWorth > (50 * player.getLevel())){
        return "You have defeated the " + name + ", gaining " + expWorth + " experience and leveling up to level " + player.getLevel() + ".\n"
               +   player.lvlUp(this) + "\n\n"
               +   map.checkDoors();
        }
        if(player.getExp() + expWorth > (50 * player.getLevel() + (50 * (player.getLevel() + 1)))){
        return "You have defeated the " + name + ", gaining " + expWorth + " experience and leveling up twice gaining level " + player.getLevel() + ".\n"
               +   player.lvlUp(this) + "\n\n"
               +   map.checkDoors();
        }
        player.setExp(player.getExp() + expWorth);
        return "You have defeated the " + name + ", and gain " + expWorth + " experience.\n"
               +  map.checkDoors();
    }
    
    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }
    
    public int getHitPoints(){
        return this.hitPoints;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getDamage() {
        return damage;
    }
    
    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isOnFire() {
        return onFire;
    }

    public void setOnFire(boolean onFire) {
        this.onFire = onFire;
    }
}
