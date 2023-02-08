package Game;

import javax.swing.JOptionPane;

public class Boss {
    static String [] questText = {"Raid bandit camp", "Kill the goblin king", "Slay a dragon"};
    int damageReceived;
    final int questDamage = 200;
    final int questAtk = 25;
    static int hpCurrent = Player.getHpCurrent();
    static int potNum = Player.getPotNum();
    static int atk = Player.getAtk();
    static int gold = Player.getGold();
    static boolean dodged = Player.isDodged();
    
    double potsUsed;
    int potsUsedInt;
    
    public void fight(){
        System.out.println("hard damage calc called");
        
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
        if(Player.getPotNum() > 0){
            System.out.println("pot node for boss");
            double tempHpCurrent = hpCurrent;
            double tempDamageReceived = damageReceived;
            System.out.println("temp current hp: "+tempHpCurrent);
            System.out.println("temp damage received: "+tempDamageReceived);
            //calculates pot usage necessary to survive
            potsUsed = Math.floor((Math.abs(tempHpCurrent - tempDamageReceived)/25)+1);
            potsUsedInt = (int)potsUsed;
            System.out.println("Pots used int: "+potsUsedInt);
            if(Player.getPotNum()>=potsUsedInt){
                Player.setPotNum(Player.getPotNum()-potsUsedInt);
                System.out.println("New pot num: "+Player.getPotNum());
                damageReceived = questDamage-(potsUsedInt*25);
            }
        }             
        //DEATH: player dies
        if(Player.isDodged() == false && damageReceived >= Player.getHpCurrent()){
            System.out.println("node 1");
            //prompt
            int redoResponse = JOptionPane.showConfirmDialog(null,"A great, stony demon appears before you in a whirlwind of cursed energy."
                    + "\nYou tremble, sensing in your bones that you stand no chance against this monolithic figure of evil."
                    + "\nNot a moment later it swings its massive obsidian greatsword down upon you, hoping to cleave you in two."
                    + "\nIt misses. Notably confused. It swings again, this time diagonal, likely thinking that the angle was the issue."
                    + "\nIt misses again. Whether it's your unearthly evasion or by the grace of God, it can't seem to hit you."
                    + "\nThis charade does not last long, however, as the demon soon realizes you lack the strength to defeat it."
                    + "\nIt leaves you, now aware of your lacking strength, and razes the Village to the ground. You weep at your"
                    + "\nweakness, repenting your lacking strength stat. You have failed to Slay the Boss."
                    + "\n\nWould you like to play again?","The Final Battle",JOptionPane.YES_NO_OPTION);
            if(redoResponse == JOptionPane.YES_OPTION){
                // restart the game 
                Player.resetStats();
                //reset the day
                Game.day = 0;
                Menu.weaponItemLevel = 1;
                Menu.armorItemLevel = 1;
                Menu.updateStatusOutput();
            }else if(redoResponse == JOptionPane.NO_OPTION){
                // exit the game
                System.exit(0);
            }  
        }
        //FAILURE: player dodges boss damage and fails to slay the boss
        else if(Player.isDodged() == true && atk < questAtk){
            System.out.println("node 2");
            //prompt
            int redoResponse = JOptionPane.showConfirmDialog(null,"A great, stony demon appears before you in a whirlwind of cursed energy."
                    + "\nYou tremble, sensing in your bones that you stand no chance against this monolithic figure of evil."
                    + "\nNot a moment later it swings its massive obsidian greatsword down upon you, hoping to cleave you in two."
                    + "\nIt misses. Notably confused. It swings again, this time diagonal, likely thinking that the angle was the issue."
                    + "\nIt misses again. Whether it's your unearthly evasion or by the grace of God, it can't seem to hit you."
                    + "\nThis charade does not last long, however, as the demon soon realizes you lack the strength to defeat it."
                    + "\nIt leaves you, now aware of your lacking strength, and razes the Village to the ground. You weep at your"
                    + "\nweakness, repenting your lacking strength stat. You have failed to Slay the Boss."
                    + "\n\nWould you like to play again?","The Final Battle",JOptionPane.YES_NO_OPTION);
            if(redoResponse == JOptionPane.YES_OPTION){
                // restart the game 
                Player.resetStats();
                //reset the day
                Game.day = 0;
                Menu.weaponItemLevel = 1;
                Menu.armorItemLevel = 1;
                Menu.setOutput1("You rise from the ashes once again, stronger than before (in spirit lol)");
                Menu.updateStatusOutput();
            }else if(redoResponse == JOptionPane.NO_OPTION){
                // exit the game
                System.exit(0);
            }  
        }
        //SUCCESS: player dodges damage and is strong enough to slay the boss
        else if(Player.isDodged() == true && atk >= questAtk){
            System.out.println("node 3");
            //prompt
            int redoResponse = JOptionPane.showConfirmDialog(null,"A great, stony demon appears before you in a whirlwind of cursed energy."
                    + "\nNot a moment later it swings its massive obsidian greatsword down upon you, hoping to cleave you in two."
                    + "\nIt misses. Notably confused. It swings again, this time diagonal, likely thinking that the angle was the issue."
                    + "\nIt misses again. Whether it's your unearthly evasion or by the grace of God, it can't seem to hit you."
                    + "\nThis procedure carries on for days until the demon grows too tired to lift its sword once again."
                    + "\nContent, you Slay the Boss, ending its existence... for now."
                    + "\n\nCongratulations adventurer! You have Slain the Boss!"
                    + "\n\nWould you like to play again?","The Final Battle",JOptionPane.YES_NO_OPTION);
            if(redoResponse == JOptionPane.YES_OPTION){
                // restart the game 
                Player.resetStats();
                //reset the day
                Game.day = 0;
                Menu.weaponItemLevel = 1;
                Menu.armorItemLevel = 1;
                Menu.setOutput1("You rise from the ashes once again, stronger than before (in spirit lol)");
                Menu.updateStatusOutput();
            }else if(redoResponse == JOptionPane.NO_OPTION){
                // exit the game
                System.exit(0);
            }  
        }
        //SUCCESS: player survives, still takes damage, and fails to slay the boss
        else if(Player.isDodged() == false && damageReceived <= hpCurrent && atk >= questAtk){
            System.out.println("node 4");
            //prompt
            int redoResponse = JOptionPane.showConfirmDialog(null,"A great, stony demon appears before you in a whirlwind of cursed energy."
                    + "\nNot a moment later the foul creature-"
                    + "\nBro. Bro stop. It's dead. You killed it. You can stop hitting it now. It's like - *literally* "
                    + "\nnot even recognizable anymore. And do me a favor and take that greatsword out of your shoulder."
                    + "\nIt's creeping me out. Okay, uh... that was pretty brutal, but I gotta get on with this, so..."
                    + "\n\nCongratulations adventurer! You have Slain the Boss!"
                    + "\n\nWould you like to play again?","The Final Battle",JOptionPane.YES_NO_OPTION);
            if(redoResponse == JOptionPane.YES_OPTION){
                // restart the game 
                Player.resetStats();
                //reset the day
                Game.day = 0;
                Menu.weaponItemLevel = 1;
                Menu.armorItemLevel = 1;
                Menu.setOutput1("You rise from the ashes once again, stronger than before (in spirit lol)");
                Menu.updateStatusOutput();
            }else if(redoResponse == JOptionPane.NO_OPTION){
                // exit the game
                System.exit(0);
            }  
        }
        //FAILURE: player survives and still takes damage but is too weak to slay the boss
        else if(Player.isDodged() == false && damageReceived <= hpCurrent && atk < questAtk){
            System.out.println("node 5");
            //prompt
            int redoResponse = JOptionPane.showConfirmDialog(null,"A great, stony demon appears before you in a whirlwind of cursed energy."
                    + "\nYou tremble, sensing in your bones that you stand no chance against this monolithic figure of evil. It swings at you,"
                    + "\nthrowing your obscenely toughened body (was it the training or did you buy up all the potions in town?) through the"
                    + "\nnearest house. You pass out. Days later, you wake up buried under the ruble. As you push your way out, you see what"
                    + "\nremains of the village. In short? Nothing. What little remains lies charred and ashen. The people no more. You have"
                    + "\nfailed them. You have failed yourself. And you have failed to Slay the Boss."
                    + "\n\nWould you like to play again?","The Final Battle",JOptionPane.YES_NO_OPTION);
            if(redoResponse == JOptionPane.YES_OPTION){
                // restart the game 
                Player.resetStats();
                //reset the day
                Game.day = 0;
                Menu.weaponItemLevel = 1;
                Menu.armorItemLevel = 1;
                Menu.setOutput1("You rise from the ashes once again, stronger than before (in spirit lol)");
                Menu.updateStatusOutput();
            }else if(redoResponse == JOptionPane.NO_OPTION){
                // exit the game
                System.exit(0);
            }  
        }
        
    }
}
