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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Orvur
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({dungeon.crawler.SpiderTest.class, dungeon.crawler.PlayerTest.class, dungeon.crawler.RoomTest.class, dungeon.crawler.BackpackTest.class, dungeon.crawler.ConsumableTest.class, dungeon.crawler.MapTest.class, dungeon.crawler.MonsterTest.class, dungeon.crawler.ValuableTest.class, dungeon.crawler.WeaponTest.class, dungeon.crawler.ItemTest.class, dungeon.crawler.DungeonCrawlerTest.class})
public class CrawlerSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
