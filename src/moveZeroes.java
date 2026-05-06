import java.util.Arrays;

public class moveZeroes {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1,0,0,1,1,1,1,1,1};
        int ans = moveZero(nums);
        System.out.println(ans);
    }
    static int moveZero(int[] nums){
        int n = nums.length;
        int maxCount=0; // maximum one found using math fucntion
        int currentCount=0;// ongoing one found in using loop

        for(int i=0; i<n; i++){
            if(nums[i] == 1){
                currentCount++;
            }else{
                maxCount = Math.max(currentCount, maxCount);
                currentCount=0;
            }
        }
        return Math.max(currentCount, maxCount);
    }
}
