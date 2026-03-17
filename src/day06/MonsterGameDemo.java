package day06;

import java.util.Scanner;

public class MonsterGameDemo {
    public static void main(String[] args) {
        Monster monster = new Monster();
        monster.name = "ZZZ";
        monster.hp = 100;

        Scanner sc = new Scanner(System.in);

        while(monster.isAlive()){
            System.out.println("恶龙 " + monster.name + " 正在释放道德绑架毒气！当前血量：" + monster.hp);
            System.out.println("请选择你的反击：1. 物理无视屏蔽（30伤害） | 2. 行星爆裂重拳（50伤害）");

            int choose = sc.nextInt();

            if(choose == 1){
                monster.takeDamage(30);
            } else if (choose == 2) {
                monster.takeDamage(50);
            }else {
                System.out.println("输入错误。防御失败......");
            }
        }
        System.out.println("You Win");

//        System.out.println("==========Monster=========");
//        Monster monster1 = new Monster();
//        monster1.hp = 100;
//        monster1.name = "ZZZ";
//        Scanner sc1 = new Scanner(System.in);
//        int choose;
//        while(monster1.hp > 0){
//            System.out.println("恶龙"+ monster1.name+"正在释放道德绑架毒气！当前血量："+ monster1.hp);
//            System.out.println("请选择你的反击：1.物理无视屏蔽（造成30点伤害）" +
//                    "|2.行星爆裂重拳（造成50点伤害）");
//            choose = sc1.nextInt();
//            if(choose == 1){
//                monster1.hp -= 30;
//            } else if (choose == 2) {
//                monster1.hp -= 50;
//            }else {
//                System.out.println("输入错误。防御失败.....");
//            }
//        }
//        System.out.println("You Win");
    }
}
