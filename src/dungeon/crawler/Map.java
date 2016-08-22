/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon.crawler;
import java.util.Random;

/**
 *
 * @author Orvur
 */
public class Map {
    Room a = new Room(33, "You enter a cave and you see a hallway in front of you. There is no turning back now.", null, null);
    Room b = new Room(27, "You enter a dimly lit room. The air is cold and damp.", null, null);
    Room c = new Room(28, "You enter the room, and shivers run down your spine. A smell of death hits your nose.", new Valuable(200, "Ruby", "A shiny ruby."), null);
    Room d = new Room(29, "You enter a room, it looks like it is the nest of something or someone.", new Consumable("Healing potion", "Potion that gives you maximum hitpoints.", "consumable"), new Spider("Spider", 15, 4, "This is a small venomous spider", 40));
    Room e = new Room(21, "You enter a room with water on the floor.", new Consumable("Mana potion", "Potion that gives you maximum Mana.", "consumable"), new Monster("Fishmonster", 10, 1, "This is a fishmonster.", 30));
    Room f = new Room(20, "You enter a dark room, you can just barely see that there are two other doors in the room.", new Consumable("Healing potion", "Potion that gives you maximum hitpoints.", "consumable"), null);
    Room g = new Room(19, "You enter a room, there are scratch marks all over the walls and floor.", new Weapon(10, "Long Sword", "A long sword with higher damage.", "weapon"), new Monster("Wolf", 25, 5, "A large and aggressive wolf.", 50));
    Room h = new Room(26, "You enter a strange-looking room, with drawings on the walls.", null, null);
    Room i = new Room(25, "You enter a room, a dead body lies on the floor. It looks like he had been in a hurry.", new Valuable(200, "Ruby", "A shiny ruby."), null);
    Room j = new Room(24, "You enter a room full of skulls. A deadly foe lives here.", new Consumable("Experience potion", "Potion that gives you one level.", "consumable"), new Monster("Rabbit", 1, 20, "This is a gray rabbit.", 20));
    Room k = new Room(18, "You enter a room that has a torch on the wall.", new Consumable("Healing potion", "Potion that gives you maximum hitpoints.", "consumable"), null);
    Room l = new Room(12, "You enter a room, it has a spooky feel to it.", new Valuable(50, "Pearl", "A peral."), new Monster("Skeleton", 25, 5, "A hideous skeleton.", 50));
    Room m = new Room(6, "You enter a room with very tall grass.", null, new Monster("Teemo", 25, 5, "A wild Teemo appears out of nowhere.", 100));
    Room n = new Room(13, "You enter a room, the floor is sticky.", null, null);
    Room o = new Room(7, "You enter a room that has a used fireplace in the middle.", new Consumable("Experience potion", "Potion that gives you one level.", "consumable"), null);
    Room p = new Room(14, "You enter a room decorated with old-looking furniture.", new Consumable("Mana potion", "Potion that gives you maximum Mana.", "consumable"), new Monster("Werewolf", 30, 7, "A large and aggressive wolf.", 50));
    Room q = new Room(15, "You enter a room with strange markings on the walls.", new Valuable(200, "Ruby", "A shiny ruby."), null);
    Room r = new Room(16, "You enter a room, there are words written in a strange language on the wall.", new Valuable(50, "Pearl", "A peral."), null);
    Room s = new Room(10, "As you walk through the door, your arm gets covered in a strange web.", new Weapon(20, "Bastard Sword", "A Bastard Sword with extreme damage.", "weapon"), new Spider("Spider", 40, 7, "This is huge spider", 200));
    Room t = new Room(22, "You enter a room that has a strange smell of brimstone.", new Consumable("Healing potion", "Potion that gives you maximum hitpoints.", "consumable"), new Dragon("Dragon", 30, 7, "A small dragon that spits fire every 5th attack. The dragon attack once you enter the Room.", 200));
    Room u = new Room(8, "You enter the room, and a strange warm breeze hits you.", new Consumable("Healing potion", "Potion that gives you maximum hitpoints.", "consumable"), null);
    Room v = new Room(2, "You enter a big room, with piles of skulls on the floor, and a powerful smell of brimstone.", new Valuable(800, "Silver Necklace", "A lovely beautiful silver necklace."), new Dragon("Dragon", 100, 15, "A large dragon that spits fire every 5th attack. The dragon attack once you enter the Room.", 200));
    Room w = new Room(3, "You enter a room that has a light coming from the ceiling, and a ladder going towards it.", null, null);
    
    private Room start;
    private Room currentRoom = start;
    private Room end;
    private Room lastRoom;
    private Player player;
    Weapon swordOne = new Weapon(6, "Swordy", "A swordy sword.", "weapon");
    private Random random = new Random();
    private int timePoisoned = 0;
    
    private int[] rooms = {0, 0, 0, 0, 0, 0,
                           0, 0, 0, 0, 0, 0,
                           0, 0, 0, 0, 0, 0,
                           0, 0, 0, 0, 0, 0,
                           0, 0, 0, 0, 0, 0,
                           0, 0, 0, 1, 0, 0};
    
    public Map(Player player) {
        this.player = player;
        a.setNorth(b);
        b.setSouth(a);
        b.setEast(c);
        b.setNorth(e);
        c.setWest(b);
        c.setEast(d);
        d.setWest(c);
        e.setSouth(b);
        e.setWest(f);
        f.setEast(e);
        f.setWest(g);
        f.setSouth(h);
        g.setEast(f);
        h.setNorth(f);
        h.setWest(i);
        i.setEast(h);
        i.setWest(j);
        j.setEast(i);
        j.setNorth(k);
        k.setSouth(j);
        k.setNorth(l);
        l.setSouth(k);
        l.setNorth(m);
        l.setEast(n);
        m.setSouth(l);
        n.setWest(l);
        n.setNorth(o);
        n.setEast(p);
        o.setSouth(n);
        p.setWest(n);
        p.setEast(q);
        p.setNorth(u);
        q.setWest(p);
        q.setEast(r);
        r.setWest(q);
        r.setNorth(s);
        r.setSouth(t);
        s.setSouth(r);
        t.setNorth(r);
        u.setSouth(p);
        u.setNorth(v);
        v.setSouth(u);
        v.setEast(w);
        w.setWest(v);
        
        setStart(a);
        setCurrentRoom(start);
        setEnd(w);
    }
    
    public Room getCurrentRoom() {
        return currentRoom;
    }
    
    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }
    
    public Room getStart() {
        return start;
    }
    
    public void setStart(Room start) {
        this.start = start;
    }
    
    public Room getEnd() {
        return end;
    }
    
    public void setEnd(Room end) {
        this.end = end;
    }
    
    public String command(String cmd){
        
        if("n".equalsIgnoreCase(cmd) || "north".equalsIgnoreCase(cmd)){
            if(currentRoom.getNorth() != null){
                if(currentRoom.getMonster() == null){
                    currentRoom = currentRoom.getNorth();
                    rooms[currentRoom.getId()] = 1;
                    if(currentRoom == end) return null;
                    return checkRoom() + monsterAttack();
                } else {
                    return "You can't move when there is a monster in the room.";
                }
            } else {
                return "You can't go north.";
            }
        }
        
        if("w".equalsIgnoreCase(cmd) || "west".equalsIgnoreCase(cmd)){
           if(currentRoom.getWest() != null){
                if(currentRoom.getMonster() == null){
                    currentRoom = currentRoom.getWest();
                    rooms[currentRoom.getId()] = 1;
                    if(currentRoom == end) return null;
                    return checkRoom() + monsterAttack();
                } else {
                    return "You can't move when there is a monster in the room.";
                }
            } else {
               return "You can't go west.";
           }
        }
        
        if("e".equalsIgnoreCase(cmd) || "east".equalsIgnoreCase(cmd)){
            if(currentRoom.getEast() != null){
                if(currentRoom.getMonster() == null){
                    currentRoom = currentRoom.getEast();
                    rooms[currentRoom.getId()] = 1;
                    if(currentRoom == end) return null;
                    return checkRoom() + monsterAttack();
                } else {
                    return "You can't move when there is a monster in the room.";
                }
            } else {
                return "You can't go east.";
            }
        }
        
        if("s".equalsIgnoreCase(cmd) || "south".equalsIgnoreCase(cmd)){
            if(currentRoom.getSouth() != null){
                if(currentRoom.getMonster() == null){
                    currentRoom = currentRoom.getSouth();
                    rooms[currentRoom.getId()] = 1;
                    if(currentRoom == end) return null;
                    return checkRoom() + monsterAttack();
                } else {
                    return "You can't move when there is a monster in the room.";
                }
             } else {
                return "You can't go south.";
            }
        }
        
        if("m".equalsIgnoreCase(cmd) || "map".equalsIgnoreCase(cmd)) {
            return showMap();
        }
        
        if("a".equalsIgnoreCase(cmd) || "attack".equalsIgnoreCase(cmd)){
            return playerAttack();
        }
        
        if("cast fireball".equalsIgnoreCase(cmd)){
            return fireball();
        }
        
        if("take cover".equalsIgnoreCase(cmd)){
            int i = random.nextInt(4);
            if(currentRoom.getMonster().getName() == "Dragon"){
            player.setCover(true);
            return "You take cover, hiding behind the closest object for one turn.\n"
                   + currentRoom.getMonster().attack(player, this, i);
            }
            return "You can only take cover when in combat with a dragon.\n";
        }
        
        if("p".equalsIgnoreCase(cmd) || "pickup".equalsIgnoreCase(cmd)){
            if(currentRoom.getMonster() == null){
                if(currentRoom.getItem() != null){
                    player.backPack.add(currentRoom.getItem());
                    String str = "You have picked up \"" + currentRoom.getItem().getName() + "\".";
                    currentRoom.setItem(null);
                    return str;
                } else {
                    return "There is no item in this room.";
                }
            } else {
                return "You can't pick up an item while there is a monster in the room.";
            }
        }
        
        if("attributes".equalsIgnoreCase(cmd)){
            return "Player name: " + player.getName() + ".\n"
                 + "Player HP: " + player.getHitPoints() + ".\n"
                 + "Player Mana: " + player.getMana() + ".\n"
                 + "Player Max HP: " + player.getMaxHitPoints() + ".\n"
                 + "Player Level: " + player.getLevel() + ".\n";
        }
        
        if(cmd.toLowerCase().startsWith("use")){
            return useItem(cmd);
        }
        
        if("b".equalsIgnoreCase(cmd) || "backpack".equalsIgnoreCase(cmd)){
            return player.getBackPack().showBackPack();
        }
        
        if("h".equalsIgnoreCase(cmd) || "help".equalsIgnoreCase(cmd)){
            return help();
        }
        
        if("l".equalsIgnoreCase(cmd) || "look".equalsIgnoreCase(cmd)){
            return look();
        }
        
        return "The command \"" + cmd + "\" does not exist.";
    }
    
    public String checkRoom() {
        String res = "";
        res += currentRoom.getDescription() + "\n\n";
        
        if(currentRoom.getMonster() != null){
             res += "There is a " + currentRoom.getMonster().getName() + " in this room. "
                 +  "The " + currentRoom.getMonster().getName() + " has " + currentRoom.getMonster().getHitPoints()
                 +  " hp and deals " + currentRoom.getMonster().getDamage() + " damage.\n"
                 +  "You are now in combat!\n";
        }
        
        if(currentRoom.getMonster() == null)
             return res + checkDoors();
        else return res;
    }
    
    public String monsterAttack(){
        int i = random.nextInt(4);
        if(currentRoom.getMonster() != null){
            currentRoom.getMonster().act(player, this, i);
            return "The " + currentRoom.getMonster().getName() + " attacks you for " + currentRoom.getMonster().getDamage() + " damage.\n"
                 + poisoned() + "\n\n"  
                 + "Player HP: " + player.getHitPoints();
        }
        return "";
        
    }
    
    
    public String playerAttack(){
        String res = "";
        int i = random.nextInt(4);
        int j = random.nextInt(player.weapon.getDamage() / 2);
        
        if(currentRoom.getMonster() != null){
            if(player.getHitPoints() - currentRoom.getMonster().getDamage() > 0 ||
               i == 0 && player.getHitPoints() - (currentRoom.getMonster().getDamage() *2) > 0 ||
               currentRoom.getMonster().getHitPoints() -  (j + (player.getWeapon().getDamage() / 2) + player.getLevel()) < 0 ||
               currentRoom.getMonster().getHitPoints() -  ((j + (player.getWeapon().getDamage() / 2) + player.getLevel()) * 2) < 0 && i == 0){
            res += "You attack the " + currentRoom.getMonster().getName() + " and you "
                +  player.attack(currentRoom.getMonster(), i , j)
                +  currentRoom.getMonster().act(player, this, i);
            }else {
            player.setLevel(1);
            player.setHitPoints(30);
            player.setMaxHitPoints(30);
            player.setWeapon(swordOne);
            currentRoom = start;
            remakeMap();
            res += "YOU HAVE BEEN DEFEATED. Everything resets, and you respawn in the starting room.";
        }
        } else {
            return "There is no monster in this room.";
        }
        
        return res;
        }
    
    public String fireball(){
        String res = "";
        int i = random.nextInt(4);

        if(currentRoom.getMonster() != null){
            if(player.getMana() >= 5){
                return currentRoom.getMonster().act(player, this, i);
            } else {return "You don't have enough mana.\n";}
        }
        return "There is no monster in this room.";
            
    }
    
    public String help() {
        return "The available commands are:\n\n"
             + "-> north         - Go north.\n"
             + "-> south         - Go south.\n"
             + "-> west          - Go west.\n"
             + "-> east          - Go east.\n"
             + "-> map           - Show the map.\n"
             + "-> attack        - Attack monster in the current room.\n"
             + "-> pickup        - Pick up item in the current room.\n"
             + "-> look          - Look around for item in the current room.\n"
             + "-> use [item]    - Use item with name [item] in your backpack.\n"
             + "-> backpack      - Show items in your backpack.\n"
             + "-> cast fireball - Attacks monster with a fireball for high damage.\n"
             + "-> attributes    - Shows the players attributes.\n"
             + "-> take cover    - You take cover when facing a Dragon.\n";
    }
    
    public String checkDoors() {
        String res = "Available paths are: ";
        
        if(currentRoom.getEast() != null)
            res += "east, ";
        if (currentRoom.getWest() != null)
            res += "west, ";
        if(currentRoom.getNorth() != null)
            res += "north, ";
        if (currentRoom.getSouth() != null)
            res += "south, ";
        
        res = res.substring(0, res.length() - 2);
        return res;
    }
    
    public String look(){
        if (currentRoom.getMonster() != null)
            return "You can't look around, because there is a monster in the room.";
        if(currentRoom.getItem() != null && currentRoom.getMonster() == null)
            return "There is a \"" + currentRoom.getItem().getName() + "\" on the floor.";
        if(currentRoom.getItem() == null)
            return "There is no item in the room.";
        
        return "";
    }
    
    public String showMap() {
        String map = "          ┌───┐┌───┐          " +
                     "          │ V ├┤ W │          " +
                     "          └─┬─┘└───┘          " +
                     "┌───┐┌───┐┌─┴─┐     ┌───┐     " +
                     "│ M ││ O ││ U │     │ S │     " +
                     "└─┬─┘└─┬─┘└─┬─┘     └─┬─┘     " +
                     "┌─┴─┐┌─┴─┐┌─┴─┐┌───┐┌─┴─┐     " +
                     "│ L ├┤ N ├┤ P ├┤ Q ├┤ R │     " +
                     "└─┬─┘└───┘└───┘└───┘└─┬─┘     " +
                     "┌─┴─┐┌───┐┌───┐┌───┐┌─┴─┐     " +
                     "│ K ││ G ├┤ F ├┤ E ││ T │     " +
                     "└─┬─┘└───┘└─┬─┘└─┬─┘└───┘     " +
                     "┌─┴─┐┌───┐┌─┴─┐┌─┴─┐┌───┐┌───┐" +
                     "│ J ├┤ I ├┤ H ││ B ├┤ C ├┤ D │" +
                     "└───┘└───┘└───┘└─┬─┘└───┘└───┘" +
                     "               ┌─┴─┐          " +
                     "               │ A │          " +
                     "               └───┘          ";
        
        String str = "";
        int chars = 0;
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = (i * 6); k < (i * 6) + 6; k++) {
                    if (rooms[k] == 1) {
                        str += map.substring(k * 5 + chars, (k * 5) + 5 + chars);
                    } else {
                        str += "     ";
                    }
                }
                
                if (j < 2 || i != 5) str += "\n";
                if (j < 2) chars += 30;
            }
        }
        
        for (int i = 0; i < 5; i++) {
            if (str.substring(0, 30).trim().isEmpty()) {
                str = str.substring(30, str.length());
            }
        }
        
        return str;
    }
    
    public String poisoned(){
        String res = "";
        if(player.isPoisoned()){
            player.setHitPoints(player.getHitPoints() - 1);
            timePoisoned++;
            res += "You are poisoned and take 1 damage.";
            if(timePoisoned == 5){
                player.setPoisoned(false);
                 res += "You are no longer poisoned.";
            }
        }
        return res;
    }
    
    public String useItem(String cmd){
        if(cmd.toLowerCase().startsWith("use ") && cmd.length() > 4) {
                String item = cmd.substring(4);
                
                if(player.backPack.checkBackPack(item)){
                    if(player.backPack.getItem(item).getName().equals("Healing potion")) {
                        player.setHitPoints(player.getMaxHitPoints());
                        player.backPack.remove(item);
                        
                        return "You have used your healing potion and gain max hitpoints.";
                    }
                    if(player.backPack.getItem(item).getName().equals("Weapon poison potion")) {
                        player.backPack.getItem(item).setDamage(player.backPack.getItem(item).getDamage() + 5);
                        player.backPack.remove(item);
                        
                        return "You have used your weapon poison potion and gain 5 more attack damage.";
                    }
                    if(player.backPack.getItem(item).getName().equals("Mana potion")) {
                        player.setMana(5);
                        player.backPack.remove(item);
                        
                        return "You have used your mana potion and restore 5 mana.";
                    }
                    if(player.backPack.getItem(item).getName().equals("Experience potion")) {
                        player.setExp(player.getExp() + 50);
                        player.backPack.remove(item);
                        
                        return "You have used your experience potion and gain 50 experience.";
                    }
                    if(player.backPack.getItem(item).getType().equals("weapon")){
                        player.backPack.add(player.getWeapon());
                        player.setWeapon((Weapon) player.backPack.getItem(item));
                        player.backPack.remove(item);
                        return "You have changed you weapon, your current item is " + player.getWeapon().getName() + " and it has " 
                             + player.getWeapon().getDamage() + " damage.\n";
                    }
                } else return "You don't have the item \"" + item + "\" in your backpack.";
        }
        return "You need to type the item name you want to use.";
    }
    
    public void remakeMap(){
        a.setRoom(33, "You enter a cave and you see a hallway in front of you. There is no turning back now.", null, null);
        b.setRoom(27, "You enter a dimly lit room. The air is cold and damp.", null, null);
        c.setRoom(28, "You enter the room, and shivers run down your spine. A smell of death hits your nose.", new Valuable(200, "Ruby", "A shiny ruby."), null);
        d.setRoom(29, "You enter a room, it looks like it is the nest of something or someone.", new Consumable("Healing potion", "Potion that gives you maximum hitpoints.", "consumable"), new Spider("Spider", 15, 4, "This is a small venomous spider", 40));
        e.setRoom(21, "You enter a room with water on the floor.", new Consumable("Mana potion", "Potion that gives you maximum Mana.", "consumable"), new Monster("Fishmonster", 10, 1, "This is a fishmonster.", 30));
        f.setRoom(20, "You enter a dark room, you can just barely see that there are two other doors in the room.", new Consumable("Healing potion", "Potion that gives you maximum hitpoints.", "consumable"), null);
        g.setRoom(19, "You enter a room, there are scratch marks all over the walls and floor.", new Weapon(10, "Long Sword", "A long sword with higher damage.", "weapon"), new Monster("Wolf", 25, 5, "A large and aggressive wolf.", 50));
        h.setRoom(26, "You enter a strange-looking room, with drawings on the walls.", null, null);
        i.setRoom(25, "You enter a room, a dead body lies on the floor. It looks like he had been in a hurry.", new Valuable(200, "Ruby", "A shiny ruby."), null);
        j.setRoom(24, "You enter a room full of skulls. A deadly foe lives here.", new Consumable("Experience potion", "Potion that gives you one level.", "consumable"), new Monster("Rabbit", 1, 20, "This is a gray rabbit.", 20));
        k.setRoom(18, "You enter a room that has a torch on the wall.", new Consumable("Healing potion", "Potion that gives you maximum hitpoints.", "consumable"), null);
        l.setRoom(12, "You enter a room, it has a spooky feel to it.", new Valuable(50, "Pearl", "A peral."), new Monster("Skeleton", 25, 5, "A hideous skeleton.", 50));
        m.setRoom(6, "You enter a room with very tall grass.", null, new Monster("Teemo", 25, 5, "A wild Teemo appears out of nowhere.", 100));
        n.setRoom(13, "You enter a room, the floor is sticky.", null, null);
        o.setRoom(7, "You enter a room that has a used fireplace in the middle.", new Consumable("Experience potion", "Potion that gives you one level.", "consumable"), null);
        p.setRoom(14, "You enter a room decorated with old-looking furniture.", new Consumable("Mana potion", "Potion that gives you maximum Mana.", "consumable"), new Monster("Werewolf", 30, 7, "A large and aggressive wolf.", 50));
        q.setRoom(15, "You enter a room with strange markings on the walls.", new Valuable(200, "Ruby", "A shiny ruby."), null);
        r.setRoom(16, "You enter a room, there are words written in a strange language on the wall.", new Valuable(50, "Pearl", "A peral."), null);
        s.setRoom(10, "As you walk through the door, your arm gets covered in a strange web.", new Weapon(20, "Bastard Sword", "A Bastard Sword with extreme damage.", "weapon"), new Spider("Spider", 40, 7, "This is huge spider", 200));
        t.setRoom(22, "You enter a room that has a strange smell of brimstone.", new Consumable("Healing potion", "Potion that gives you maximum hitpoints.", "consumable"), new Dragon("Dragon", 30, 7, "A small dragon that spits fire every 5th attack. The dragon attack once you enter the Room.", 200));
        u.setRoom(8, "You enter the room, and a strange warm breeze hits you.", new Consumable("Healing potion", "Potion that gives you maximum hitpoints.", "consumable"), null);
        v.setRoom(2, "You enter a big room, with piles of skulls on the floor, and a powerful smell of brimstone.", new Valuable(800, "Silver Necklace", "A lovely beautiful silver necklace."), new Dragon("Dragon", 100, 15, "A large dragon that spits fire every 5th attack. The dragon attack once you enter the Room.", 200));
        w.setRoom(3, "You enter a room that has a light coming from the ceiling, and a ladder going towards it.", null, null);
    }
}

