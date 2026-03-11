import java.util.Scanner;

public class Temperature {
    public static void main (String[] args){
        System.out.println("Enter temperature in Celsius:");
        Scanner sc = new Scanner(System.in);
        double C = sc.nextDouble();
        System.out.println("Temperature in Fahrenheit is : " + (C*9/5+32));
    }
}
