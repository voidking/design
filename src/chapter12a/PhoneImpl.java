package chapter12a;

public class PhoneImpl implements Phone
{
    public void call(String name)
    {
        System.out.println(name + "正在通话中");
    }
}
