package chapter15;

public class HaoFlyweight implements Flyweight
{
    public String getName()
    {
        return name;
    }

    private String name;

    public HaoFlyweight(String name)
    {
        this.name = name;
    }
}
