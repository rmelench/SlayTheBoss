package Game;

abstract class Encounter implements Quest{
    static String [] questText;
    int hpPotential;
    int damageReceived;
    int questDamage;
    int questAtk;
    int questGold;
    int gold;
   
    @Override
    public void damageCalc(){
        
    }
}