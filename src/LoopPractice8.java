import java.util.Scanner;

public class LoopPractice8 {
    public static void main(String[] args) {
       // Input a number `n`, calculate sum from 1 to `n
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("please input a number:");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println("sum="+(sum));

    }
}
