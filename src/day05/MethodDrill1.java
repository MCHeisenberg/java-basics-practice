package day05;

public class MethodDrill1 {
    public static void main(String[] args) {
        printLine();
        printMenu();

        printInfo("Tom", 20);
        printInfo("Alice", 22);

        System.out.println(getSum(3, 4));

        System.out.println(getMax(10, 7));
        System.out.println(getMax(2, 9));

        System.out.println(getMin(10, 7));

        System.out.println(isEven(4));
        System.out.println(isEven(7));

        System.out.println(isPositive(10));
        System.out.println(isPositive(-3));
    }

    public static void printLine(){
        System.out.println("------------");
    }

    public static void printMenu(){
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Update");
        System.out.println("4. Exit");
    }

    public static void printInfo(String name,int age){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static int getSum(int a, int b){
        return a + b;
    }

    public static int getMax(int a, int b){
        if(a < b){
            return b;
        }else return a;
    }

    public static int getMin(int a, int b){
        if(a < b){
            return a;
        }else return b;
    }

    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }else return false;
    }

    public static boolean isPositive(int num){
       return num > 0;
    }
}
