package day04;

public class ArraySearchDemo {
    public static void main(String[] args) {
        int[] arr = {3, 8, 15, 20, 27};
        int target = 15;
        boolean found = false;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("存在");
        }else {
            System.out.println("不存在");
        }
    }
}
