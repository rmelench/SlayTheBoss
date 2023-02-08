package Game;

import java.util.*;

public class Normal extends Encounter {
    static String [] questText = {"Hunt wolf pack", "Clear out local goblin nest", "Pillage ancient ruins"};
    final int questDamage = 75;
    final int questAtk = 15;
    final int questGold = 75;
    static int hpCurrent = Player.getHpCurrent();
    int potNum = Player.getPotNum();
    static int atk = Player.getAtk();
    static int gold = Player.getGold();
    static boolean dodged = Player.isDodged();
    
    double potsUsed;
    int potsUsedInt;
    
    //int damageRecieved = 0;
    @Override
    public void damageCalc(){
        System.out.println("normal damage calc called");
        
        int hpCurrent = Player.getHpCurrent();
        int potNum = Player.getPotNum();
        int atk = Player.getAtk();
        int gold = Player.getGold();
        boolean dodged = Player.isDodged();

        //determines whether player dodges or not
        Player.setDodged(Prob.getDodgedChance(Player.getEva()));
        System.out.println("Player dodged: "+Player.isDodged());
        damageReceived = questDamage;
        //debug
        System.out.println(Player.getHpCurrent());
        System.out.println(damageReceived);
        System.out.println(Player.getPotNum());
        
        //if player has any pots, runs special damage calc
        if((Player.getHpCurrent() <= damageReceived) && Player.getPotNum() > 0){
            System.out.println("pot node");
            double tempHpCurrent = hpCurrent;
            double tempDamageReceived = damageReceived;
            System.out.println("temp current hp: "+tempHpCurrent);
            System.out.println("temp damage received: "+tempDamageReceived);
            //calculates pot usage necessary to survive
            potsUsed = Math.floor((Math.abs(tempHpCurrent - tempDamageReceived)/25)+1);
            potsUsedInt = (int)potsUsed;
            System.out.println("Pots used int: "+potsUsedInt);
            if(Player.getPotNum()>=potsUsedInt){
                System.out.println("pot node 1");
                Player.setPotNum(Player.getPotNum()-potsUsedInt);
                System.out.println("New pot num: "+Player.getPotNum());
                Player.setHpCurrent(hpCurrent-questDamage+(potsUsedInt*25));
                damageReceived = 0;
            }else{
                System.out.println("pot node 2");
                Menu.setOutput1("You rise from the ashes once again, stronger than before (in spirit lol)");
                Game.endGame();
            }
        }         
        //player dies
        if(Player.isDodged() == false && damageReceived >= Player.getHpCurrent()){
            System.out.println("node 1");
            Menu.setOutput1("You rise from the ashes once again, stronger than before (in spirit lol)");
            Game.endGame();
        }
        //player dodges damage but is too weak to complete quest (no reward)
        else if(Player.isDodged() == true && atk < questAtk){
            System.out.println("node 2");
            //undo gold gain done in menu
            Player.setGold(gold -= questGold);
            //appends specific outcome to the quest flavortext
            Menu.setOutput1(Prob.getRandomString(questText)+"\n\nYou have survived due to your outstanding agility!"
                    + "\n\n Unfortunately, you failed to complete the quest and so received no reward for your troubles...");
        }
        //player dodges damage and is strong enough to complete quest (receives reward)
        else if(Player.isDodged() == true && atk >= questAtk){
            System.out.println("node 3");
            Menu.setOutput1(Prob.getRandomString(questText)+"\n\nYou have evaded all damage and completed the quest!\n\n"+questGold+" gold has been added to your inventory.");
        }
        //player survives, still takes damage, and receives quest reward
        else if(Player.isDodged() == false && damageReceived <= hpCurrent && atk >= questAtk){
            System.out.println("node 4");
            System.out.println("Player's current hp: "+Player.getHpCurrent());
            Player.setHpCurrent(Player.getHpCurrent() - damageReceived);
            System.out.println("Player's current hp after quest survival: "+Player.getHpCurrent());
            Menu.setOutput1(Prob.getRandomString(questText)+"\n\nYou have survived and successfully completed the quest!\n\n"+questGold+" gold has been added to your inventory.");
        }
        //player survives and still takes damage but is too weak to complete quest
        else if(Player.isDodged() == false && damageReceived <= hpCurrent && atk < questAtk){
            System.out.println("node 5");
            System.out.println("Player's current hp: "+Player.getHpCurrent());
            Player.setGold(gold -= questGold);
            Player.setHpCurrent(Player.getHpCurrent() - damageReceived);
            System.out.println("Player's current hp after quest survival: "+Player.getHpCurrent());
            Menu.setOutput1(Prob.getRandomString(questText)+"\n\nYou have survived, but failed to complete the quest and so received no reward for your troubles...");
        }
    }
}