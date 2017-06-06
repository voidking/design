package chapter15;

public class XiangFlyweight implements Flyweight
{
    public String getName()
    {
        return name;
    }

    public XiangFlyweight(String name)
    {
        this.name = name;
    }

    private String name;
}
