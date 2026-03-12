import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input an integer : ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("这是偶数。");
        }else{
            System.out.println("这是奇数。");
        }
    }
}
