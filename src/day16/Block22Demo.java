package day16;

import java.util.Scanner;

public class Block22Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sc.hasNextInt();
        int s = sc.nextInt();

        while(true){
            System.out.println("-Menu-");
            System.out.println("1. hello");
            System.out.println("2. bye");
            System.out.println("3. exit");

            System.out.print("inout: ");
            int choice=sc.nextInt();

            if(choice==1){
                System.out.println("hello");
            } else if (choice==2) {
                System.out.println("bye");
            } else if (choice==3) {
                break;
            }
        }
    }

//    public static boolean hasValidChoice(Scanner sc) {
//
//    }
}
