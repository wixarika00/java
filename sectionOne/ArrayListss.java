import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListss {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Adam");
        list.add("Kate");
        list.add("Joe");

        list.remove("Joe");

        list.add(1,"Joe2");

        list.set(1,"Joe33");

        list.size();

        list.isEmpty();


        Collections.sort(list);
        
        // list.equals(list2);

        System.out.println(Arrays.toString(list.toArray()));
    }
}
