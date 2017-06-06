package chapter18;

public class Client
{
    public static void main(String[] args)
    {
        Document document = new Document();
        document.setState("创建中");
        document.handle();
        document.handle();
        document.handle();
        document.handle();
        document.handle();

    }
}
