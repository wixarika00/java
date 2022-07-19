import java.util.Arrays;

public class Arrayss {
    public static void main(String[] args) {
        int[] nums = {3,5,2,7};
        int[] nums2 = {3,5,2,7,6,10};

        System.out.println(Arrays.equals(nums, nums2));
;
        int[] copyArray = Arrays.copyOf(nums, nums.length);
        System.out.println(Arrays.toString(copyArray));

        Arrays.sort(nums);

        //binary search

        int result = Arrays.binarySearch(nums, 5);
        System.out.println(result);
        
        System.out.println(Arrays.toString(nums));
    }
}
