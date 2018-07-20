package test1;

/**
 * Created by Administrator on 2018/7/20.
 */
public class A {
    public A(){
        System.out.println("A method");
    }
    {
        System.out.println("A class");
    }
    static {
        System.out.println("A static");
    }
  public C c=new C();
    public class C {
        public C(){
            System.out.println("C method");
        }
        {
            System.out.println("C class");
        }

    }
    public D d;
    public class D {
        public D(){
            System.out.println("D method");
        }
        {
            System.out.println("D class");
        }

    }
}
