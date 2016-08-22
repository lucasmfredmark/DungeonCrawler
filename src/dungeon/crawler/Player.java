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
public class Player {
    private String name;
    private int hitPoints;
    private int maxHitPoints;
    private int level;
    private int exp = 0;
    private int mana = 5;
    public Backpack backPack;
    public Weapon weapon;
    private boolean poisoned = false;
    private boolean cover = false;
    Random ran = new Random();
    
    public Player(String name, int max, int lvl, Backpack bp, Weapon weapon) {
        this.name = name;
        this.hitPoints = max;
        this.maxHitPoints = max;
        this.level = lvl;
        this.backPack = bp;
        this.weapon = weapon;
    }

    /**
     * Does damage to the monster in the current room.
     * Special attack that uses mana.
     * @param map
     * @return 
     */
    public String fireball(Map map){
        map.getCurrentRoom().getMonster().setHitPoints(map.getCurrentRoom().getMonster().getHitPoints() - 10 - level * 5);
        map.getCurrentRoom().getMonster().setOnFire(true);
        setMana(getMana() - 5);
        return "You cast a large fireball at the " + map.getCurrentRoom().getMonster().getName()
            +  ".\nYou deal " + (10 + level * 5) + " damage to the " + map.getCurrentRoom().getMonster().getName() + ".\n"
            +  map.getCurrentRoom().getMonster().OnFire();
    }
    
    /**
     * Normal no crit attack. Does damage to the monster in the current Room.
     * @param monster
     * @param i
     * @return 
     */
    public String hit(Monster monster, int i){
        monster.setHitPoints(monster.getHitPoints() - (i + (weapon.getDamage() / 2) + level));
        return "deal " + (i + (weapon.getDamage() / 2) + level) + " damage.\n";
    }
    
    /**
     * Crit attack does 2x more damage than a normal attack.
     * @param monster
     * @param i
     * @return 
     */
    public String crit(Monster monster, int i){
        monster.setHitPoints(monster.getHitPoints() - (i + (weapon.getDamage() / 2) + level) * 2);
        return "crit for " + ((i + (weapon.getDamage() / 2) + level) * 2) + " damage.\n";
    }
    
    /**
     * Takes a random number to determine if it will be a hit or a crit.
     * @param monster
     * @param i
     * @param j
     * @return 
     */
    public String attack(Monster monster,int i, int j){
        if(i == 0)
          return crit(monster, j);
        else return hit(monster, j);
    }
    
    /**
     * Makes the player go up one level.
     * @param monster
     * @return 
     */
    public String lvlUp(Monster monster) {
        level += 1;
        exp -= 50 * level;
        if(hitPoints == maxHitPoints){
            maxHitPoints += 10;
            hitPoints = maxHitPoints;
            return "Your max hitpoints has incresed by 10 and your hitpoints are at max.";
        }
        maxHitPoints += 10;
        return "Your max hitpoints has incresed by 10.";
    }
            
    public String getName() {
        return name;
    }
    
    public int getHitPoints(){
        return this.hitPoints;
    }
    
    public void setHitPoints(int hitPoints){
        this.hitPoints = hitPoints;
    }
    
    public int getMaxHitPoints() {
        return maxHitPoints;
    }
    
    public void setMaxHitPoints(int maxHitPoints) {
        this.maxHitPoints = maxHitPoints;
    }
    
    public int getLevel() {
        return level;
    }
    
    public void setLevel(int level) {
        this.level = level;
    }
    
    public Backpack getBackPack() {
        return backPack;
    }
    
    public void setBackPack(Backpack backPack) {
        this.backPack = backPack;
    }
    
    public Weapon getWeapon() {
        return weapon;
    }
    
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public boolean isPoisoned() {
        return poisoned;
    }

    public void setPoisoned(boolean poisoned) {
        this.poisoned = poisoned;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public boolean isCover() {
        return cover;
    }

    public void setCover(boolean cover) {
        this.cover = cover;
    }
    
    
}
