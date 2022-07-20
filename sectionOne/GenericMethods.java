import java.util.ArrayList;

public class GenericMethods {
    public static void main(String[] args) {
    
        // ArrayList<String> arrayList = new ArrayList<>();

        // arrayList.add("Adam");

        // String name = arrayList.get(0);

        String[] names = {"Adam", "Kevin", "Joe"};
        Integer[] nums = {1,2,3,4};
        printArray(names, nums);

    }

    public static <T,V>void printArray(T[] t, V[] v) {

        System.out.println("First array:\n");

        for(T value : t)
            System.out.println(value);

        System.out.println("Second array:\n");

        for(V value : v)
        System.out.println(value);

    }


}