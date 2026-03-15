package day04;

public class ArrayCalcDemo2 {
    public static void main(String[] args) {
        int[] arr = {23, 67, 12, 89, 34};

        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("最大值：" + max);
    }
}
