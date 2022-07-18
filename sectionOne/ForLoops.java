public class ForLoops {
    public static void main(String[] args) {
       
        for(int i=0;i<5;i++) {
            System.out.println("Outer for loop i index " + i);

            for(int j=0;j<5;j++) {
                System.out.println("i value" + i + "- j value " +j); 

            }
        }

        int[][] nums = new int[3][3];
        System.out.println(nums); 
        
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                nums[i][j] = i*j;
            }
        }

        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
}
}
