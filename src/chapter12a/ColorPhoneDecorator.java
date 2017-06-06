package chapter12a;

public class ColorPhoneDecorator extends PhoneDecorator
{
    public ColorPhoneDecorator(Phone phone)
    {
        super(phone);
    }

    public void call(String name)
    {
        System.out.println("播放彩铃");
        super.call(name);
    }
}
