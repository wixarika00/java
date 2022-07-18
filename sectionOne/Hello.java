public class Hello {
    public static void main(String[] args) {
        System.out.println("Greetings Java");

        int a = 10;
        int b = 20;

        if(a>5 || b<100) {
            System.out.println("TRUE");
        } else {
            System.out.println("False");
        }

        int result = a < b ? a : b;
        System.out.println(result);

        String name = "Ewa";
        String result1=name.equals("Adam") ? "Yes" : "No";
        System.out.println(result1);

        int c = 0;
        System.out.println(c==0 ? "Zero" : c<0 ? "negative" : "positive");
    }
}