package Arrays;

public class SumOfElementsInArray {
    public static void main(String[] args) {

        int[] nums = {2, 3, 54, 65, 67, 8};//initializing the array of numbers
        int sum = sumOfElementsInArray(nums);//function call to sum up all the elements in the array
        System.out.println("Total Sum:" + sum);//prints the total sum of element in the array

    }

    public static int sumOfElementsInArray(int[] nums){

        if(nums.length == 1){
            return nums[0];//if the array contains only one element it will returns the number it self it will not traverse again
        }

        int start = 0;//pointing to the first element in the array
        int end = nums.length - 1;//pointing to the last element in the array
        int totalSum = 0;//variable which will stores total sum of the elements
        while(start <= end){//it will checks the condition

            totalSum += (nums[start] + nums[end]);//adding the array elements from first and last
            start += 1;//updating the index by incrementing
            end -= 1;//updating the index by decrementing

        }
        return totalSum;//returning the total sum of the elements in the array
    }
}
