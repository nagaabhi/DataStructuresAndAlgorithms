package Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        int[] nums = {2,2,2,2};
        int res = countUniqueElements(nums);
        System.out.println("Unique Elements:" + res);

    }

    public static int countUniqueElements(int[] nums){

        int start = 0;
        int end = 1;
        int count = 0;
        while(end <= nums.length - 1){

            if(nums[start] == nums[end]) {
                count += 1;
            }
            start += 1;
            end += 1;
        }

        return (nums.length - count);
    }


}
