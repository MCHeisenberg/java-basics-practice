import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args){
        System.out.println("Enter the radius of the circle: ");
        double radius;
        Scanner sc = new Scanner(System.in);
        radius = sc.nextDouble();
        System.out.println("Circle Area is : " + (Math.PI*radius*radius));
    }
}
