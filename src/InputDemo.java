import java.util.Scanner;

public class InputDemo {
    public static void main(String[] ars){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入你的名字：");
        String name = sc.next();
        System.out.println("hello,"+ name);
    }
}
