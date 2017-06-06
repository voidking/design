package chapter15;

public class InterFlyweight implements Flyweight
{
    public String getName()
    {
        return name;
    }

    public InterFlyweight(String name)
    {
        this.name = name;
    }

    private String name;
}
