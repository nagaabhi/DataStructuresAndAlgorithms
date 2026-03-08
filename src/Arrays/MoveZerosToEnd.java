package Arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {

        int[] nums = {0, 0, 0, 0, 0, 1};
        int[] ans = moveZerosToEnd(nums);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] moveZerosToEnd(int[] nums){

        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            if(nums[start] == 0){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                end -= 1;

            }
            start += 1;

        }
        return nums;
    }
}
