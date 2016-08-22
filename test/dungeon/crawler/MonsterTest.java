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
public class MonsterTest {
    
    public MonsterTest() {
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
     * Test of act method, of class Monster.
     */
    @Test
    public void testAct() {
        System.out.println("act");
        Player player = null;
        Map map = null;
        Monster instance = null;
        String expResult = "";
        String result = instance.act(player, map, 0);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of attack method, of class Monster.
     */
    @Test
    public void testAttack() {
        System.out.println("attack");
        Player player = null;
        Map map = null;
        Monster instance = null;
        String expResult = "";
        String result = instance.attack(player, map, 0);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of crit method, of class Monster.
     */
    @Test
    public void testCrit() {
        System.out.println("crit");
        Player player = null;
        Map map = null;
        Monster instance = null;
        String expResult = "";
        String result = instance.crit(player, map);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hit method, of class Monster.
     */
    @Test
    public void testHit() {
        System.out.println("hit");
        Player player = null;
        Map map = null;
        Monster instance = null;
        String expResult = "";
        String result = instance.hit(player, map);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of OnFire method, of class Monster.
     */
    @Test
    public void testOnFire() {
        System.out.println("OnFire");
        Monster instance = null;
        String expResult = "";
        String result = instance.OnFire();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dead method, of class Monster.
     */
    @Test
    public void testDead() {
        System.out.println("dead");
        Player player = null;
        Map map = null;
        Monster instance = null;
        String expResult = "";
        String result = instance.dead(player, map);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHitPoints method, of class Monster.
     */
    @Test
    public void testSetHitPoints() {
        System.out.println("setHitPoints");
        int hitPoints = 0;
        Monster instance = null;
        instance.setHitPoints(hitPoints);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHitPoints method, of class Monster.
     */
    @Test
    public void testGetHitPoints() {
        System.out.println("getHitPoints");
        Monster instance = null;
        int expResult = 0;
        int result = instance.getHitPoints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Monster.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Monster instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Monster.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Monster instance = null;
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDamage method, of class Monster.
     */
    @Test
    public void testGetDamage() {
        System.out.println("getDamage");
        Monster instance = null;
        int expResult = 0;
        int result = instance.getDamage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDamage method, of class Monster.
     */
    @Test
    public void testSetDamage() {
        System.out.println("setDamage");
        int damage = 0;
        Monster instance = null;
        instance.setDamage(damage);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Monster.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Monster instance = null;
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Monster.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Monster instance = null;
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isOnFire method, of class Monster.
     */
    @Test
    public void testIsOnFire() {
        System.out.println("isOnFire");
        Monster instance = null;
        boolean expResult = false;
        boolean result = instance.isOnFire();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOnFire method, of class Monster.
     */
    @Test
    public void testSetOnFire() {
        System.out.println("setOnFire");
        boolean onFire = false;
        Monster instance = null;
        instance.setOnFire(onFire);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
