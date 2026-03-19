package day08;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1");
        if(sc.hasNextInt()){
            System.out.println("2");
            sc.next();
            System.out.println("3");
            int i = sc.nextInt();
            //System.out.println(sc.nextInt());
            return;
        }

        System.out.println("not int");

    }
}
