import java.util.Arrays;

public class AnonArrays {
    public static void main(String[] args) {
        // int[] nums = {1,2,3,4,5};

        //anonymus array
        modify(new int[]{1,2,3});
        // System.out.println(Arrays.toString(nums));
    }

    private static void modify(int[] nums) {
        for(int i=0;i<nums.length;i++)
        nums[i]=nums[i]*10;
    }
}
