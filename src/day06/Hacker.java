package day06;

public class Hacker {
    String name;
    double energy;

    public void startHacking(int attempts){
        for(int i = 1; i <= attempts; i++){
            System.out.println(name+"正在执行第"+i+"次代码注入...");
            energy -= 13;
            if(energy % 6 == 0){
                System.out.println("Hacker"+name+ "Win.");
                break;
            }
            if(energy <= 0) {
                System.out.println("Hacker"+name+"exhausted...");
                break;
            }
        }
    }
}
