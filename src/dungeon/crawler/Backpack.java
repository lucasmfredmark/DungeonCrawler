/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon.crawler;
import java.util.ArrayList;

/**
 *
 * @author Orvur
 */
public class Backpack {
    ArrayList<Item> backPack = new ArrayList<>();
    
    
    public Backpack() {
        Consumable hpot = new Consumable("Healing potion", "Potion that gives you maximum hitpoints.", "consumable");
        Consumable mpot = new Consumable("Mana potion", "Potion that gives you maximum Mana.", "consumable");
        backPack.add(hpot);
        backPack.add(mpot);
    }
    /**
     * Adds item to backpack object.
     * @param item 
     */
    public void add(Item item) {
        backPack.add(item);
    }
    
    /**
     * Searches through the list to match for an items name or type,
     * if there is a match it gets removed.
     * @param item 
     */
    public void remove(String item) {
        for(int i = 0; i < backPack.size(); i++){
            if(backPack.get(i).name.equals(item) || backPack.get(i).type.equals(item)) {
                backPack.remove(i);
                break;
            }
        }
    }
    
    /**
     * 
     * @return Returns every item in the list in the form of String. 
     */
    public String showBackPack() {
        String str = "In your backpack you have:";
        
        for(int i = 0; i < backPack.size(); i++) {
            str += "\n- " + backPack.get(i).getName();
        }
        
        return str;
    }
    
    /**
     * 
     * @param name
     * @return Returns true if the name matches a name of an item in the list.
     */
    public boolean checkBackPack(String name) {
        for(int i = 0; i < backPack.size(); i++){
            if(name.equals(backPack.get(i).getName()))
                return true;
        }
        
        return false;
    }
    
    
    /**
     * 
     * @param name
     * @return Returns an item if it matches the name, description or type
     *         of the parameter.
     */
    public Item getItem(String name){
        for(int i = 0; i < backPack.size(); i++){
            if(name.equals(backPack.get(i).getDescription()) || name.equals(backPack.get(i).getName()) || name.equals(backPack.get(i).getType()))
                return backPack.get(i);
        }
        
        return null;
    }
}
