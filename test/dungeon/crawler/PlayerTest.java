/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon.crawler;

import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Orvur
 */
public class PlayerTest {
    
    public PlayerTest() {
    }

    /**
     * Test of fireball method, of class Player.
     */
    @Test
    public void testFireball() {
        Backpack bp = new Backpack();
        Weapon sword = new Weapon(6, "Swordy", "A swordy sword.", "weapon");
        Player player = new Player("Hans", 30, 1, bp, sword);
        Map map = new Map(player);
        map.setCurrentRoom(new Room(1, "", null, new Monster("Fishmonster", 40, 1, "", 0)));
        System.out.println("fireball");
        String expResult = "You cast a large fireball at the " + "Fishmonster"
                        +  ".\nYou deal " + (10 + 1 * 5) + " damage to the " + "Fishmonster" + ".\n"
                        +  "The " + "Fishmonster" + " is on fire and takes 1 damage.\n";
        String result = player.fireball(map);
        assertEquals(expResult, result);
        assertTrue(map.getCurrentRoom().getMonster().isOnFire());
    }
    /**
     * Test of hit method, of class Player.
     */
    @Test
    public void testHit() {
        System.out.println("hit");
        Random sc = new Random();
        Backpack bp = new Backpack();
        Weapon sword = new Weapon(6, "Swordy", "A swordy sword.", "weapon");
        Player player = new Player("Hans", 30, 1, bp, sword);
        Map map = new Map(player);
        map.setCurrentRoom(new Room(1, "", null, new Monster("", 40, 1, "", 0)));
        int i = sc.nextInt(player.getWeapon().getDamage() / 2);
        String expResult = "deal " + (i + (6 / 2) + player.getLevel()) + " damage.\n";;
        String result = player.hit(map.getCurrentRoom().getMonster(), i);
        assertEquals(expResult, result);

    }

    /**
     * Test of crit method, of class Player.
     */
    @Test
    public void testCrit() {
        System.out.println("crit");
        Random sc = new Random();
        Backpack bp = new Backpack();
        Weapon sword = new Weapon(6, "Swordy", "A swordy sword.", "weapon");
        Player player = new Player("Hans", 30, 1, bp, sword);
        Map map = new Map(player);
        map.setCurrentRoom(new Room(1, "", null, new Monster("", 40, 1, "", 0)));
        int i = sc.nextInt(player.getWeapon().getDamage() / 2);
        String expResult = "crit for " + ((i + (6 / 2) + player.getLevel()) * 2) + " damage.\n";
        String result = player.crit(map.getCurrentRoom().getMonster(), i);
        assertEquals(expResult, result);
        assertFalse(map.getCurrentRoom().getMonster() == null);

    }

}
