package chapter11;
public class Client
{
    public static void main(String[] args)
    {
        TestProxy testProxy = new TestProxy(new TestImpl());
        testProxy.doLogic("小巩");
    }
}
