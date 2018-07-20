import test1.B;

public class Main {

    public static void main(String[] args) {
    test1();
    }
    static void test1(){
        System.out.println("main in");
        B b=new B();
        System.out.println("main out");
//        main in
//        A static
//        B static
//        A class
//        C class
//        C method
//        A method
//        B class
//        B method
//        main out
    }
}
