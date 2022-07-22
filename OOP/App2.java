public class App2 implements ModernInterface {
    public static void main(String[] args) {
        
        JavaBeanExample javaBeanExample = new JavaBeanExample();
        javaBeanExample.setId(1);
        javaBeanExample.setName("Java Bean 1");

        App2 app2 = new App2();
        app2.abstractMethod();

        ModernInterface.staticMethod();

        app2.defaultMethod();
    }

    @Override
    public void abstractMethod() {
        System.out.println("Abstract interface...");
        
    }
}
