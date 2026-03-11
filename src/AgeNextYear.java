import java.util.Scanner;

public class AgeNextYear {//1.input the age 2.output the age in the next year
    public static void main(String args[]){
        System.out.println("Your age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("age(in next year): "+(age+1));
    }
}
