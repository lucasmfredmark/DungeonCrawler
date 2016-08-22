/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon.crawler;

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
public class MapTest {
    
    public MapTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getCurrentRoom method, of class Map.
     */
    @Test
    public void testGetCurrentRoom() {
        System.out.println("getCurrentRoom");
        Map instance = null;
        Room expResult = null;
        Room result = instance.getCurrentRoom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentRoom method, of class Map.
     */
    @Test
    public void testSetCurrentRoom() {
        System.out.println("setCurrentRoom");
        Room currentRoom = null;
        Map instance = null;
        instance.setCurrentRoom(currentRoom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStart method, of class Map.
     */
    @Test
    public void testGetStart() {
        System.out.println("getStart");
        Map instance = null;
        Room expResult = null;
        Room result = instance.getStart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStart method, of class Map.
     */
    @Test
    public void testSetStart() {
        System.out.println("setStart");
        Room start = null;
        Map instance = null;
        instance.setStart(start);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnd method, of class Map.
     */
    @Test
    public void testGetEnd() {
        System.out.println("getEnd");
        Map instance = null;
        Room expResult = null;
        Room result = instance.getEnd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnd method, of class Map.
     */
    @Test
    public void testSetEnd() {
        System.out.println("setEnd");
        Room end = null;
        Map instance = null;
        instance.setEnd(end);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of command method, of class Map.
     */
    @Test
    public void testCommand() {
        System.out.println("command");
        String cmd = "";
        Map instance = null;
        String expResult = "";
        String result = instance.command(cmd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkRoom method, of class Map.
     */
    @Test
    public void testCheckRoom() {
        System.out.println("checkRoom");
        Map instance = null;
        String expResult = "";
        String result = instance.checkRoom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of monsterAttack method, of class Map.
     */
    @Test
    public void testMonsterAttack() {
        System.out.println("monsterAttack");
        Map instance = null;
        String expResult = "";
        String result = instance.monsterAttack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playerAttack method, of class Map.
     */
    @Test
    public void testPlayerAttack() {
        System.out.println("playerAttack");
        Map instance = null;
        String expResult = "";
        String result = instance.playerAttack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fireball method, of class Map.
     */
    @Test
    public void testFireball() {
        System.out.println("fireball");
        Map instance = null;
        String expResult = "";
        String result = instance.fireball();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of help method, of class Map.
     */
    @Test
    public void testHelp() {
        System.out.println("help");
        Map instance = null;
        String expResult = "";
        String result = instance.help();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkDoors method, of class Map.
     */
    @Test
    public void testCheckDoors() {
        System.out.println("checkDoors");
        Map instance = null;
        String expResult = "";
        String result = instance.checkDoors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of look method, of class Map.
     */
    @Test
    public void testLook() {
        System.out.println("look");
        Map instance = null;
        String expResult = "";
        String result = instance.look();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showMap method, of class Map.
     */
    @Test
    public void testShowMap() {
        System.out.println("showMap");
        Map instance = null;
        String expResult = "";
        String result = instance.showMap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of poisoned method, of class Map.
     */
    @Test
    public void testPoisoned() {
        System.out.println("poisoned");
        Map instance = null;
        String expResult = "";
        String result = instance.poisoned();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
