package chapter15;

public class ShangFlyweight implements Flyweight
{
    public String getName()
    {
        return name;
    }

    public ShangFlyweight(String name)
    {
        this.name = name;
    }

    private String name;
}
