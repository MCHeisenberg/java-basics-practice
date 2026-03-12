import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
import java.util.Spliterator;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input a number : ");
        double num = sc.nextDouble();
        while(num != 0){
            if(num > 0){
                System.out.println("Positive");
                num = sc.nextDouble();
            } else{
                System.out.println("Negative");
                num = sc.nextDouble();
            }
        }
        System.out.println("Zero");
    }
}
