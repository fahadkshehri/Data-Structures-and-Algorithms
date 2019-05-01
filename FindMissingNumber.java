public class Main {

    public static void main(String[] args){

       int[] nums = {1,2,3,4,5,7};

        System.out.println(findMissingNumber(nums));
    }

    /**
     * Finds the missing number in a sorted list of numbers
     * @param nums Integer array of numbers
     */
    public static int findMissingNumber(int[] nums) {
        int sum = 0;
        int missing = 0;

        //sum the values (numbers in the array) into an integer variable
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        //Add the all the values including the missing value
        //Use the index of the array to add the total values
        //The array loops condition stops at the size of the given value + 1
        //because it is missing 1 number that we have to include
        for (int i = 1; i <= nums.length + 1; i++) {
            missing += i;
        }

        return missing - sum;
    }