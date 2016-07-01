public class Median {
    /**
     * @param nums: A list of integers.
     * @return: An integer denotes the middle number of the array.
     */
    public int getMedian(int[] nums) {

        for(int firstIndex = 0; firstIndex < nums.length; firstIndex++) {
            int minIndex = firstIndex;
            int nextIndex = firstIndex + 1;
            while(nextIndex < nums.length) {
                if(nums[nextIndex] < nums[minIndex]) {
                    minIndex = nextIndex;
                }
                nextIndex++;
            }
            swapElement(firstIndex, minIndex, nums);
        }

        if(nums.length%2==0) {
            return nums[nums.length/2-1];
        }
        else
            return nums[nums.length/2];
        // write your code here
        // write your code here
    }

    public void swapElement(int one, int two, int[] a) {
        int temp;
        temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public static void main(String args[]) {
        int[] array = {7, 9, 4, 5};
        Median obj = new Median();
        System.out.println("The median of this array is: " + obj.getMedian(array));
    }
}