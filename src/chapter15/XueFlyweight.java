package chapter15;

public class XueFlyweight implements Flyweight
{
    public String getName()
    {
        return name;
    }

    private String name;

    public XueFlyweight(String name)
    {
        this.name = name;
    }
}
