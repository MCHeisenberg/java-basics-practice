package day05;

public class MethodDrill2 {
    public static void main(String[] args) {
        System.out.println(square(5));
        System.out.println(cube(3));

        System.out.println(abs(8));
        System.out.println(abs(-8));

        System.out.println(isLeapYear(2024));
        System.out.println(isLeapYear(2023));

        int[] arr = {3, 8, 2, 10, 5};
        System.out.println(getArraySum(arr));
        System.out.println(getArrayMax(arr));
        System.out.println(getArrayMin(arr));
        System.out.println(countEven(arr));

        System.out.println(cToF(0));
        System.out.println(cToF(30));

        System.out.println(ftoC(32));
        System.out.println(ftoC(86));

        System.out.println(calcAverage(80,90,100));

        printStars(5);
        printStars(10);
    }

    public static int square(int num){
        return num * num;
    }

    public static int cube(int num){
        return num * num * num;
    }

    public static int abs(int num){
        if(num >= 0){
            return num;
        }else return -num;
    }

    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getArraySum(int[] arr){
        int sum = 0;
        for(int i = 0; i <= arr.length-1; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static int getArrayMax(int[] arr){
        int max = arr[0];
        for(int i = 0; i <= arr.length-1; i++){
            if(max < arr[i])max = arr[i];
        }
        return max;
    }

    public static int getArrayMin(int[] arr){
        int min = arr[0];
        for(int i = 0; i <= arr.length-1; i++){
            if(min > arr[i])min = arr[i];
        }
        return min;
    }

    public  static int countEven(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0)count++;
        }
        return  count;
    }

    public static double cToF(double c){
        return c * 9 / 5 + 32;
    }

    public static double ftoC(double f){
        return (f - 32) * 5 / 9;
    }

    public static double calcAverage(int a, int b, int c){
        return (a + b + c)/3;
    }

    public static void printStars(int n){
        for(int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
