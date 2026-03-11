import java.util.Scanner;

public class NameGreeting {
    public static void main(String[] args){
        System.out.println("Your name:");
        Scanner sc=new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello "+name);
    }
}
