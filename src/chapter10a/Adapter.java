package chapter10a;

public class Adapter implements Target
{
    public void operation1()
    {

    }

    public void operation2()
    {

    }

    private Adaptee lnkAdaptee;

    public Adapter(Adaptee lnkAdaptee)
    {
        this.lnkAdaptee = lnkAdaptee;
    }
}
