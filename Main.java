import java.util.*;

class Main{
    public static void main(String[] args){
        int[] nums = {2,4,11,3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    public static int[] twoSum(int[] nums, int target){
        int[] output = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                int complement = target - nums[i];
                
                if(nums[j] == complement){
                    output[0] = i;
                    output[1] = j;
                }
            }
        }

        return output;
    }
}