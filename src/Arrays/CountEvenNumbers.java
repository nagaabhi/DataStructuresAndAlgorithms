package Arrays;

public class CountEvenNumbers {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//array containing the number values
        int totalEvenNumbers = countEvenNumbers(nums);//function call to count the total number of even numbers
        System.out.println("Total Even Numbers:" + totalEvenNumbers);//prints the total number of even numbers

    }

    public static int countEvenNumbers(int[] nums){

        if(nums.length == 0){
            return 0;//checks if the no elements found in the array, if no elements found in the array it will return as 0
        }

        int start = 0;//pointing to the first position in the array
        int end = nums.length - 1;//pointing to the last position in the array
        int totalEvenNumbers = 0;//variable will holds total number of even numbers

        if(nums.length == 1){//checks if array contains at least one element
            if(nums[0] % 2 == 0){//if it contains at least one element and if that element it self is even number it will increments and return the value
                totalEvenNumbers += 1;
                return  totalEvenNumbers;
            }
        }
        while(start <= end){//checks the condition

            if(nums[start] % 2 == 0){//checks if first element in the array is even, if it is even it will increment.
                totalEvenNumbers += 1;
            }
            if(nums[end] % 2 == 0){//checks if last element in the array is even, if it is even it will increment.
                totalEvenNumbers += 1;
            }


            start += 1;
            end -= 1;

            //if the array is odd length and if use start <= end, and if start and end value is having the both even number
            //it will increments twice so checking the if there index position same and if the number is even in the both the index
            //position it will update the count
            if(start == end){
                if(nums[start] % 2 == 0 && nums[end] % 2 == 0){
                    totalEvenNumbers -= 1;
                }
            }
        }

        return totalEvenNumbers;// it will returns the total even numbers.
    }
}
