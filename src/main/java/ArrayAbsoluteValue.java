
public class ArrayAbsoluteValue {
    /**
     * Given an array of integers 'nums', produce an array of integers composed of the absolute values of all the
     * numbers in 'nums'. Absolute value represents the distance from zero, so negative numbers should become positive
     * and positive numbers should stay the same.
     *
     * @param nums an array.
     * @return the absolute value array of nums.
     */
    public int[] getArrayAbs(int[] nums){
        int [] myarr = new int [nums.length];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] >= 0){
                myarr[i]=nums[i];
                }
            else {
                myarr[i] = -nums[i]; // negative nums assigns an absolute value 
            }
        }
        return myarr;
    }
}