package day04;

import java.util.Scanner;

public class IfElseIfDemo {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Please input your grades:");
        int score = sc.nextInt();
        if(score < 0 || score >100){
            System.out.println("Wrong grades");
        }else if(score >= 90){
            System.out.println("Level: A");
        } else if (score >= 80) {
            System.out.println("Level: B");
        } else if (score >= 70) {
            System.out.println("Level: C");
        } else if (score >= 60) {
            System.out.println("Level: D");
        }else {
            System.out.println("Level: E");
        }
    }
}
