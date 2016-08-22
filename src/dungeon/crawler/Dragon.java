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
public class Dragon extends Monster {
    private int fireTimer = 0;

    public Dragon(String name, int hitPoints, int damage, String description, int exp) {
        super(name, hitPoints, damage, description, exp);
    }
    /**
     * Special attack for the Dragon Class.
     * @param player
     * @param map
     * @param i
     * @return 
     */
    @Override
    public String attack(Player player, Map map,int i){
        if(fireTimer == 4){
            fireTimer = 0;
            return fireAttack(player, map);
        }
        fireTimer++;
        return super.attack(player, map, i);
    }
    
    /**
     * Every five attack the Dragon makes a special fire attack.
     * @param player
     * @param map
     * @return 
     */
    public String fireAttack(Player player, Map map){
        if(player.isCover() == false){
            player.setHitPoints(0);
            return map.getCurrentRoom().getMonster().getName() + " spits out fire killing everything that is not in cover.\n\n"
                     + "Player HP: " + player.getHitPoints() + "\n"
                     + "Monster HP: " + map.getCurrentRoom().getMonster().getHitPoints();
        }
        player.setCover(false);
        return map.getCurrentRoom().getMonster().getName() + " spits out fire killing everything that is not in cover. Luckily you were in cover.\n\n"
                     + "Player HP: " + player.getHitPoints() + "\n"
                     + "Monster HP: " + map.getCurrentRoom().getMonster().getHitPoints();
    }

    public int getFireTimer() {
        return fireTimer;
    }

    public void setFireTimer(int fireTimer) {
        this.fireTimer = fireTimer;
    }
    
}
