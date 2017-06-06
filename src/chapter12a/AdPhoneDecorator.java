package chapter12a;

public class AdPhoneDecorator extends PhoneDecorator
{
    public AdPhoneDecorator(Phone phone)
    {
        super(phone);
    }

    public void call(String name)
    {
    	System.out.println("播放广告");
        super.call(name);
        
    }
}
