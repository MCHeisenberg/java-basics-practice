package day07;
import java.util.Scanner;

public class TyrantGameV2Demo {
    public static void main(String[] args) {
        MechaVersion2 myMecha = new MechaVersion2("复仇者",200,200);
        MechaVersion2 glassCannon = new MechaVersion2("玻璃大炮", 50, 500);

        TyrantVersion2 bloodyTyrant = new TyrantVersion2("Joe", 300, 25);

        Scanner sc = new Scanner(System.in);

        while (myMecha.isAlive() && bloodyTyrant.isAlive()){
            System.out.println("【战况】我的血量：" + myMecha.hp + " | 能量：" + myMecha.energy
                    + " VS 暴君血量：" + bloodyTyrant.hp);
            System.out.println("1. 动能机枪(30伤害) | 2. 轨道天基武器(40能量，80伤害) | 3. 纳米修复(30能量，恢复50血)");

            int choose = sc.nextInt();

            if(choose == 1){
                bloodyTyrant.takeDamage(30);
            } else if (choose == 2) {
                myMecha.orbitalStrike(bloodyTyrant);
            } else if (choose == 3) {
                myMecha.repair();
            }

            if(bloodyTyrant.isAlive()){
                bloodyTyrant.attack(myMecha);
            }
        }
        if(myMecha.isAlive()){
            System.out.println("You Win");
        }else {
            System.out.println("You Grown");
        }
    }



}
