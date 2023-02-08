package Game;

import static Game.Menu.eva;
import java.util.Random;
import java.lang.Math.*;

// This class pertains to any events involving probability (Evading attacks, determining encounters and loot drops, etc.)
public class Prob {
    // method for random element in a String array
    public static String getRandomString(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }  
    
    public static boolean getDodgedChance(int eva) {
        int x;
        Random rnd = new Random();
        // random integers in [0, 100]
        x = rnd.nextInt(100);
        if (x > eva){
            return false;
        }
        
        else{
            return true;
        }
    }  
}