//懒汉式
package chapter08a;

public class Singleton1
{
    protected Singleton1()
    {
    }

    private static Singleton1 instance = null;

    public static synchronized Singleton1 getInstance()
    {
        if (instance == null)
        {
            return new Singleton1();
        }
        return instance;
    }
}