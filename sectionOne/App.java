public class App {

    enum Day {
        MONDAY,
        TUESDAY
    }
    public static void main(String[] args) {
       
    String str = "this&is&a&super&cool&string";
    String[] strings = str.split("&",6);
    for (String s : strings)
        System.out.println(s);

    
        System.out.println(Day.MONDAY);
        Day monday = Day.TUESDAY;
        System.out.println(monday);
    }
}