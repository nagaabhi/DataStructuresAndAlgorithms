package Arrays;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};//This is the original array
        System.out.println("Original Array:" + Arrays.toString(nums));//Printing the original array
        int[] reversedArray = reverseAnArray(nums);//function call for reversing the array
        System.out.println("Reversed Array:" + Arrays.toString(reversedArray));//it will Prints the updated reversed array

    }

    public static int[] reverseAnArray(int[] nums){

        if(nums.length  == 0 || nums.length == 1){
            return nums;
        }//if the length of the array is 0 or 1 there is no need to traverse each and every element in the array.



        int start = 0;//points to the first element in the array
        int end = nums.length - 1;//points to the last element in the array


        while(start <= end){//it will checks the condition weather it is true or false

            int temp = nums[start];//initially storing the first element in the temp variable
            nums[start] = nums[end];//updating the first element to last element
            nums[end] = temp;//updating the last element to first element

            start += 1;//moving forward by incrementing the index value
            end -= 1;//moving backward by decrementing the index value
        }

        return nums;//returning the updated array which is reversed...
    }
}
