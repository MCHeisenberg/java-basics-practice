package day04;
import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：（1~3）");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("初级");
                break;
            case 2:
                System.out.println("中级");
                break;
            case 3:
                System.out.println("高级");
                break;
            default:
                System.out.println("无效等级");
        }
    }
}
