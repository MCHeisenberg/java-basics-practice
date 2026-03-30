package day15;

public class MainBlock19Merge {
    public static void main(String[] args) {
        
    }
    public static int sumArray(int[] nums) {
        int sum=0;
        for (int i=0;i<nums.length;i++) {
            sum+=nums[i];
        }
        return sum;
    }
    
    public static int findMax(int[] nums) {
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
               max =  nums[i];
            }
        }
        return max;
    }

    public static boolean hasNumber(int[] nums, int target) {

        for (int i=0;i<nums.length;i++) {
            if (nums[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static int countTarget(int[] nums,int target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                count ++;
            }
        }

        return count;
    }
    public static void replaceTarget(int[] nums, int oldValue, int newValue) {
      for(int i=0;i<nums.length;i++){
          if(nums[i] == oldValue){
              nums[i]=newValue;
          }
      }
    }
}
