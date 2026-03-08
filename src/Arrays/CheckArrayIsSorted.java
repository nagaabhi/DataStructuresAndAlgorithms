package Arrays;

public class CheckArrayIsSorted {
    public static void main(String[] args) {

        int[] nums = {10};
        boolean isSorted = isArrayIsSorted(nums);
        System.out.println("Sorted:" + isSorted);

    }

    public static boolean isArrayIsSorted(int[] nums){

        if(nums.length == 1 || nums.length == 0){
            return true;
        }

        int start = 0;
        int end = 1;
        while(end <= nums.length - 1){

            if(nums[start] < nums[end]){
                start += 1;
                end += 1;
            }else{
                return false;
            }
        }
        return true;
    }
}
