public class MultiDimArrays {
    public static void main(String[] args) {

        int[][] nums = new int [3][4];

        for(int i=0;i<3;i++) {
            for(int j=0;j<4;j++) {
                nums[i][j]=i+j;
            }
        }
 
        //random access - extremly fast

        nums[2][2] =8;

        for(int i=0;i<3;i++) {
            for(int j=0;j<4;j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println(); 
        }

        int[][] nums2 = {{1,2,3,4},{4,5},{7,8,9}};

        for(int [] array : nums2) {
            for(int num : array) {
                System.out.print(num +" ");
            }
            System.out.println(); 
        }


    }
}
