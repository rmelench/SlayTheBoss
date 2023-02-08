package Game;

public class Player {
    
    // player stats
    private static int hpMax = 50;
    private static int hpCurrent = 50;
    private static int atk = 10;
    private static boolean isDead = false;
    private static boolean dodged = false;
    private static int gold = 5;
    private static int eva = 10;
    private static int potNum = 0;
    
    // base player stats
    final private static int hpMaxBase = 50;
    final private static int hpCurrentBase = 50;
    final private static int atkBase = 10;
    final private static int goldBase = 5;
    final private static int evaBase = 10;
    final private static int potNumBase = 0;
   
    public static void resetStats(){
        hpMax = hpMaxBase;
        hpCurrent = hpCurrentBase;
        isDead = false;
        atk = atkBase;
        gold = goldBase;
        eva = evaBase;
        dodged = false;
        potNum = potNumBase;
    }
    
    // create player stat getters
    public static int getHpMax() {
        return hpMax;
    }

    public static int getHpCurrent() {
        return hpCurrent;
    }

    public static boolean isIsDead() {
        return isDead;
    }

    public static int getAtk() {
        return atk;
    }

    public static int getGold() {
        return gold;
    }

    public static int getEva() {
        return eva;
    }
    
    public static boolean isDodged() {
        return dodged;
    }

    public static int getPotNum() {
        return potNum;
    }
    
    // create player stat setters
    public static void setHpMax(int hpMax){
        Player.hpMax = hpMax;
    }
    
    public static void setHpCurrent(int hpCurrent){
        Player.hpCurrent = hpCurrent;
    }
    
    public static void setIsDead(boolean isDead){
        Player.isDead = isDead;
    }
    
    public static void setAtk(int atk){
        Player.atk = atk;
    }
    
    public static void setGold(int gold){
        Player.gold = gold;
    }
    
    public static void setEva(int eva){
        Player.eva = eva;
    }
    
    public static void setDodged(boolean dodged){
        Player.dodged = dodged;
    }
    
    public static void setPotNum(int potNum){
        Player.potNum = potNum;
    }  
}