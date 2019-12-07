import java.util.Random;
import java.util.Scanner;

public abstract class Information{
    int playerHP;
    int playerAtt;
    int playerLVL;
    int playerExp;
    int playerCurrentExp;
    int Uang;
    int Gold = 250;
    int weaponDMG;
    int upDef;
    Weapon weapon = new Weapon();
    Armor armor = new Armor();
    Player player = new Player();
    String Musuh;
    int plusDef = 3;
    int ChanceDef = 3;
    int ChanceEsc;
    int earnExp;
    int enemyAtt;
    int Healing;
    int HealingChance = 3;
}
