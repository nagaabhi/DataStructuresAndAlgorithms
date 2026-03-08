package Arrays;

public class UniqueElements {
    public static void main(String[] args) {

        int[] nums = {2,2,2,2};//array containing the elements
        int res = countUniqueElements(nums);//function call to count unique elements in the array
        System.out.println("Unique Elements:" + res);//prints value after checking the unique values

    }

    public static int countUniqueElements(int[] nums){

        int start = 0;//pointing to the first position in the array
        int end = 1;//pointing to the second position in the array
        int count = 0;//variable that will count total number of repeated elements in the array
        while(end <= nums.length - 1){//checks the condition if end is less then or equal to array length-1

            if(nums[start] == nums[end]) {//checks if the two repeated elements are found in the array
                count += 1;//if found it will increments
            }
            start += 1;//or else start will get updated
            end += 1;//end will get updated
        }

        return (nums.length - count);//after counting the total number of repeated elements
        //(count is subtracted in total length of the array)
    }


}
