package test1;

/**
 * Created by Administrator on 2018/7/20.
 */
public class B extends A {
    public B(){
        System.out.println("B method");
    }
    {
        System.out.println("B class");
    }
    static {
        System.out.println("B static");
    }
}
