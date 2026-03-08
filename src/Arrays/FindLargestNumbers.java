package Arrays;

public class FindLargestNumbers {
    public static void main(String[] args) {


        int[] nums = {10, 4, 6, 2};
        int ans = findLargestNumber(nums);
        System.out.println("Largest Number:" + ans);


    }
    static int findLargestNumber(int[] nums){


        int i;
        int largestNum = 0;
        for(i = 0; i < nums.length; i++){
            if(nums[i] > largestNum){
                largestNum = nums[i];
            }
        }
        return largestNum;
    }



}

