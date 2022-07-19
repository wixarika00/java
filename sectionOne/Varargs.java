public class Varargs {
    public static void main(String[] args) {

        sum(3,5);

    }

    public static void sum(int ... nums) {

        int sum = 0;

        for(int i=0;i<nums.length;i++)
            sum = sum + nums[i];

        System.out.println("Result is: " + sum);
    }
}
