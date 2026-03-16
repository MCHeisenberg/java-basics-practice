package day05;

public class MethodRefactorChallenge {
    public static void main(String[] args) {
        int a = 1,b = 2;
        printTitle();
        printIsEven(isEven(getSum(a, b)));

    }

    public static  void printTitle(){
        System.out.println("=== Result ===");
    }

    public static int getSum(int a, int b){
        return (a + b);
    }

    public static boolean isEven(int n){
        return (n % 2 == 0);
    }

    public static void printIsEven(boolean b){
        if(b) System.out.println("是偶数");else System.out.println("是奇数");
    }
}
