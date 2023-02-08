package Game;

import Game.Player;
import javax.swing.JOptionPane;

public class Game{
    public static int day = 0;
    
    public static void endGame(){
        
        int redoResponse = JOptionPane.showConfirmDialog(null,"Would you like to play again?", "You have died!",JOptionPane.YES_NO_OPTION);
        if(redoResponse == JOptionPane.YES_OPTION){
            // restart the game 
            Player.resetStats();
            //reset the day
            Menu.setOutput1("You rise from the ashes once again, stronger than before (in spirit lol)");
            day = 0;
            Menu.weaponItemLevel = 1;
            Menu.armorItemLevel = 1;
            Menu.updateStatusOutput();
        }
            
        else if(redoResponse == JOptionPane.NO_OPTION){
            // exit the game
            System.exit(0);
        }  
    }    
}
