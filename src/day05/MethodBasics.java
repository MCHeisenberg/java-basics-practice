package day05;

public class MethodBasics {
    public static void main(String[] args) {
        sayHello();

        printSum(3, 5);
        printSum(10, 20);

        int result = getSum(4, 6);
        System.out.println(result);
        System.out.println(getSum(1, 2));

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(getArraySum(arr));
    }

    public static void sayHello(){
        System.out.println("Hello Method");
    }

    public static void printSum(int a, int b){
        System.out.println(a + b);
    }

    public static int getSum(int a, int b){
        return a + b;
    }

    public static int getArraySum(int[] arr){
        int sum = 0;
        for(int i = 0; i <= arr.length-1; i++){
            sum += arr[i];
        }
        return sum;
    }
}
