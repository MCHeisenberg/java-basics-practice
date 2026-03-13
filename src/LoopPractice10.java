import java.util.Scanner;

public class LoopPractice10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int correctPassword = 1234;
        int Password;

        System.out.println("please input the Password:");
        Password = sc.nextInt();

        while(Password != 1234){
            System.out.println("Wrong password, try again.");
            Password = sc.nextInt();
        }
        System.out.println("Login success.");
    }
}
