//饿汉式
package chapter08a;

public class Singleton2
{
    private static Singleton2 instance = new Singleton2();

    protected Singleton2()
    {
    }

    public static Singleton2 getInstance()
    {
        return instance;
    }
}
