package chapter12a;

public class Client
{
    public static void main(String[] args)
    {
        Phone phone = new PhoneImpl();
        PhoneDecorator phoneDecorator = new ColorPhoneDecorator(phone);
        phoneDecorator.call("张三");

        System.out.println("**********");

        phoneDecorator = new AdPhoneDecorator(phone);
        phoneDecorator.call("李四");

        System.out.println("**********");

        phoneDecorator = new AdPhoneDecorator(new ColorPhoneDecorator(phone));
        phoneDecorator.call("王五");
    }
}
