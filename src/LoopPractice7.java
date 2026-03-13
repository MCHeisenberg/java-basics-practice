import java.util.Scanner;

public class LoopPractice7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input a integer:");
        int integer = sc.nextInt();

        for(int i = 1; i <= integer; i++){
            System.out.println(i);
        }
    }
}
