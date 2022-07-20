import java.util.ArrayList;
import java.util.List;

public class App1 {
    public static void main(String[] args) {
        
        Parent p1 = new Parent();
        Parent p2 = new Child();
        Parent p3 = new GrandChild();

        p1.travel();
        p2.travel();
        p3.travel();

        //In Java, we can overrride methods only, not the variables, so runtimr polymorphism cannot 
        //be achieved by data members

        Person p4 = new Person();
        p4.setAge(22);
        p4.setName("Adam");

        System.out.println(p4);

        //Encapsulation - encapsulation with mutable classes

        List<String> cars = new ArrayList<>();
        cars.add("Honda");
        cars.add("Ford");
        cars.add("Mercedes");

        Cars carsClass = new Cars();
        carsClass.setCars(cars);

        for (String s : carsClass.getCars())
            System.out.println(s);

    }
}
