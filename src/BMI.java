import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
        double weight,height;
        System.out.println("Enter your weight in kg:");
        Scanner sc = new Scanner(System.in);
        weight = sc.nextDouble();
        System.out.println("Enter your height in meters:");
        height = sc.nextDouble();
        System.out.println("Your BMI is : " + (weight/(height*height)));
    }
}
