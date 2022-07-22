public interface ModernInterface {

    //classic interface method(abstract method)
    public void abstractMethod();

    //static method - we need to have a body
    public static void staticMethod() {
        System.out.println("This is static...");
    }

    
    public default void defaultMethod() {
        System.out.println("This is default...");
    }


}
