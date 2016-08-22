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
public class RoomTest {
    
    public RoomTest() {
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
     * Test of getId method, of class Room.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Room instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Room.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Room instance = null;
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNorth method, of class Room.
     */
    @Test
    public void testSetNorth() {
        System.out.println("setNorth");
        Room north = null;
        Room instance = null;
        instance.setNorth(north);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEast method, of class Room.
     */
    @Test
    public void testSetEast() {
        System.out.println("setEast");
        Room east = null;
        Room instance = null;
        instance.setEast(east);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWest method, of class Room.
     */
    @Test
    public void testSetWest() {
        System.out.println("setWest");
        Room west = null;
        Room instance = null;
        instance.setWest(west);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSouth method, of class Room.
     */
    @Test
    public void testSetSouth() {
        System.out.println("setSouth");
        Room south = null;
        Room instance = null;
        instance.setSouth(south);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNorth method, of class Room.
     */
    @Test
    public void testGetNorth() {
        System.out.println("getNorth");
        Room instance = null;
        Room expResult = null;
        Room result = instance.getNorth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEast method, of class Room.
     */
    @Test
    public void testGetEast() {
        System.out.println("getEast");
        Room instance = null;
        Room expResult = null;
        Room result = instance.getEast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWest method, of class Room.
     */
    @Test
    public void testGetWest() {
        System.out.println("getWest");
        Room instance = null;
        Room expResult = null;
        Room result = instance.getWest();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSouth method, of class Room.
     */
    @Test
    public void testGetSouth() {
        System.out.println("getSouth");
        Room instance = null;
        Room expResult = null;
        Room result = instance.getSouth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItem method, of class Room.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        Room instance = null;
        Item expResult = null;
        Item result = instance.getItem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItem method, of class Room.
     */
    @Test
    public void testSetItem() {
        System.out.println("setItem");
        Item item = null;
        Room instance = null;
        instance.setItem(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMonster method, of class Room.
     */
    @Test
    public void testGetMonster() {
        System.out.println("getMonster");
        Room instance = null;
        Monster expResult = null;
        Monster result = instance.getMonster();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMonster method, of class Room.
     */
    @Test
    public void testSetMonster() {
        System.out.println("setMonster");
        Monster monster = null;
        Room instance = null;
        instance.setMonster(monster);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
