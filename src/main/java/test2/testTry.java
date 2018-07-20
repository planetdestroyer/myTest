package test2;

/**
 * Created by Administrator on 2018/7/20.
 */
public class TestTry {
    public static int test1()
    {

        int x = 1;

        try

        {

            return x;

        }

        finally

        {
            System.out.println("finally in");
            ++x;

        }

    }
    public static int  test2()

    {

        try

        {

            return   1 ;

        }

        finally

        {

            return   2 ;

        }

    }



}

