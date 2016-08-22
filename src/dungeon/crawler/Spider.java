/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon.crawler;

/**
 *
 * @author Orvur
 */
public class Spider extends Monster {

    public Spider(String name, int hitPoints, int damage, String description, int expWorth) {
        super(name, hitPoints, damage, description, expWorth);
    }
/**
 * Special attack for the Spider class.
 * @param player
 * @param map
 * @param i
 * @return Returns a given String depending on if it is the first time he attacks.
 */
    @Override
    public String attack(Player player, Map map, int i) {
        super.attack(player, map, i);
        player.setPoisoned(true);
        if(player.isPoisoned() == false){
        return "You have been attacked by the Spider for " + this.getDamage()
             + ", and you have been poisoned.\n"
             + "You will take 1 damage every time you move to another room.\n"
             + "This effect last 5 moves.\n"
             + "Player HP: " + player.getHitPoints() + "\n"
             + "Monster HP: " + map.getCurrentRoom().getMonster().getHitPoints();
    } else return "You have been attacked by the Spider for " + this.getDamage() + ".\n"
                + "Player HP: " + player.getHitPoints() + "\n"
                + "Monster HP: " + map.getCurrentRoom().getMonster().getHitPoints();
    }
}
