package day08;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1");
        sc.hasNextInt();
        System.out.println("2");
        System.out.println("3");
        int i = sc.nextInt();
            //System.out.println(sc.nextInt())

    }

    public static int getValidChoice(Scanner sc){
        while(true){
            if(!sc.hasNextInt()){
                System.out.println("输入错误，请输入：1、2 或 3！");
                System.out.print("请重新输入：");
                sc.next();
                continue;
            }

            int choice = sc.nextInt();

            if(choice >= 1 && choice <= 3){
                return choice;
            }else {
                System.out.println("输入错误，请输入：1、2 或 3！");
                System.out.print("请重新输入：");
            }

        }
    }

}
