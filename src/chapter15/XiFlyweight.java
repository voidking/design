package chapter15;

public class XiFlyweight implements Flyweight
{
    public String getName()
    {
        return name;
    }

    public XiFlyweight(String name)
    {
        this.name = name;
    }

    private String name;
}
