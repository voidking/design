package chapter15;

public class TianFlyweight implements Flyweight
{
    public String getName()
    {
        return name;
    }

    public TianFlyweight(String name)
    {
        this.name = name;
    }

    private String name;
}
