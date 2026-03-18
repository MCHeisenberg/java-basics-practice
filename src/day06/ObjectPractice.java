package day06;

public class ObjectPractice {
    public static void main(String[] args) {
        Student st1 = new Student();

        st1.name = "Tom";
        st1.age = 20;

        System.out.println(st1.name);
        System.out.println(st1.age);
        st1.study();


        Car c1 = new Car();

        c1.brand = "BMW";
        c1.price = 350000.0;

        c1.run();


        Book b1 = new Book();
        b1.title = "Gogb";
        b1.author = "Alice";
        System.out.println(b1.author);
        System.out.println(b1.title);
        b1.showInfo();


        Student st2 = new Student();
        st2.name = "Lucy";
        st2.age = 22;
        System.out.println(st2.name);
        System.out.println(st2.age);
        st2.study();

        Car c2 = new Car();
        c2.brand = "Tesla";
        c2.price = 280000.0;
        System.out.println(c2.brand);
        System.out.println(c2.price);
        c2.run();

        Book b2 = new Book();
        b2.title = "Clean Code";
        b2.author = "Robert C. Martin";
        b2.showInfo();

        st1.name = "Tommy";
        st1.age = 88;
        st1.study();

        c1.brand = "Audi";
        c1.run();


        Computer computer1 = new Computer();
        computer1.master = "Brigand";
        computer1.brand = "Monster";
        computer1.showInfo();

        System.out.println("===========");

        Student st3 = new Student();
        st3.name = "Bird";
        st3.age = 88;

        Car c3 = new Car();
        c3.brand = "Ghost";
        c3.price = 999999999999.9;

        Computer co2 = new Computer();
        co2.master = st3.name;
        co2.brand = c3.brand;

        st3.study();
        c3.run();
        co2.showInfo();

        System.out.println("====================");

        Student st10 = new Student();
        Computer pc10 = new Computer();
        pc10.brand = "Greatest";
        st10.myPc = pc10;
        st10.name = "王大麻子";
        st10.age = 888;
        st10.writeCode();

        System.out.println("=========Hacker Time===========");
        Hacker hacker1 = new Hacker();
        hacker1.name="黑龙傲天雄霸宇宙无敌老汉炸鸡腿";
        hacker1.energy=9425;
        hacker1.startHacking(150);

        System.out.println("====Hunter=====");
        Weapon weapon1 = new Weapon();
        weapon1.name = "Junk";
        weapon1.damage = 88888;
        BountyHunter hunter1 = new BountyHunter();
        hunter1.name = "ajsd";
        hunter1.equippedWeapon = weapon1;
        hunter1.fire();

//        playMonsterGame();

//        playTyrantGame();
    }

//    public static void playMonsterGame(){
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
//    }

//    public static void playTyrantGame(){
//        System.out.println("===============TyrantGame================");
//        Mecha mecha1 = new Mecha();
//        mecha1.name = "MechaGo";
//        Tyrant tyrant1 = new Tyrant();
//        tyrant1.name = "CreepyGoddamnJoe";
//        Scanner sc1 = new Scanner(System.in);
//        int choose;
//        while(mecha1.hp >= 0 && tyrant1.hp >= 0){
//            System.out.println("【战况：】我的血量："+mecha1.hp+"|能量："+mecha1
//                    .energy+"VS"+"暴君血量："+tyrant1.hp);
//            System.out.println("1. 动能机枪 (0消耗，造成 30 伤害) | 2. 轨道天基武器 " +
//                    "(消耗 40 能量，造成 80 爆裂伤害) | 3. 纳米修复 " +
//                    "(消耗 30 能量，恢复 50 血量)");
//            choose = sc1.nextInt();
//            if(choose == 1){
//                tyrant1.hp -= 30;
//            }else if(choose == 2){
//                if(mecha1.energy >= 40){
//                    mecha1.energy -= 40;
//                    tyrant1.hp -= 80;
//                }else System.out.println("能量不足。");
//            } else if (choose == 3) {
//                if(mecha1.energy >= 30){
//                    mecha1.energy -= 30;
//                    mecha1.hp += 50;
//                }else System.out.println("能量不足。");
//            }else System.out.println("wrong choose");
//            if(tyrant1.hp >= 0){
//                mecha1.hp -= tyrant1.attackPower;
//                System.out.println("暴君发起了精神污染攻击！你失去了 25 点血量！");
//            }
//        }
//        if(tyrant1.hp <= 0){
//            System.out.println("物理超度完成！世界终于清静了！hhh");
//        }else if(mecha1.hp <= 0){
//            System.out.println("GG...系统崩溃，你被恶心鼠了..");
//        }
//
//
//    }
}
