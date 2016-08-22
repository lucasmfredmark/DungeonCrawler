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
public class BackpackTest {
    
    public BackpackTest() {
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
     * Test of add method, of class Backpack.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Item item = null;
        Backpack instance = new Backpack();
        instance.add(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Backpack.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        String item = "";
        Backpack instance = new Backpack();
        instance.remove(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showBackPack method, of class Backpack.
     */
    @Test
    public void testShowBackPack() {
        System.out.println("showBackPack");
        Backpack instance = new Backpack();
        String expResult = "";
        String result = instance.showBackPack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkBackPack method, of class Backpack.
     */
    @Test
    public void testCheckBackPack() {
        System.out.println("checkBackPack");
        String name = "";
        Backpack instance = new Backpack();
        boolean expResult = false;
        boolean result = instance.checkBackPack(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItem method, of class Backpack.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        String name = "";
        Backpack instance = new Backpack();
        Item expResult = null;
        Item result = instance.getItem(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
