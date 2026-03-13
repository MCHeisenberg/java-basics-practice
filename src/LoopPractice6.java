public class LoopPractice6 {
    public static void main(String[] args) {
        int n = 100;
        int sum = 0;
        for(int i = 2; i <= 100; i ++){
            if(i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
