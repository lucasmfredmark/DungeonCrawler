/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon.crawler;
import java.util.Scanner;

/**
 *
 * @author Orvur
 */
public class DungeonCrawler {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Backpack bp = new Backpack();
        Weapon sword = new Weapon(6, "Swordy", "A swordy sword.", "weapon");
        
        
        System.out.print("Welcome to our game. This is a textbased Dungeon Crawler game. You win by getting to the final room.\n\n"
                       + "What is your name.\n\n/>");
                        
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        
        Player player = new Player(name, 30, 1, bp, sword);
        Map map = new Map(player);
        
        System.out.println("\nHello " + name + "!\n");
        System.out.println(map.help() + "\n\n"
                        + map.getCurrentRoom().getDescription() + "\n\n"
                        + map.checkDoors() + "\n\n"
                        + "/> ");
        
        String cmd = "";
        
        while(cmd != null){
            cmd = map.command(sc.nextLine());
            System.out.print("\n" + cmd + "\n\n/> ");
        }
        
        System.out.println("Congratulations, you have won the game.");
    }
}
