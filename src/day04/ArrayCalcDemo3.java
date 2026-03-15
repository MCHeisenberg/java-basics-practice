package day04;

public class ArrayCalcDemo3 {
    public static void main(String[] args) {
        int[] arr = {80, 90, 70, 10, 60};
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double avg = sum * 1.0 / arr.length;
        System.out.println("平均值：" + avg);
    }
}
