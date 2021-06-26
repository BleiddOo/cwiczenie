package pl.gda.wsb;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        TestClass o1 = new TestClass("Jan","Kowalski");
        System.out.println(o1);
        o1.changeName("Adam");
        o1.changeLastName("Nowak");
        System.out.println(o1);
    }
}
