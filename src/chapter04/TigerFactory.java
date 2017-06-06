package chapter04;

public class TigerFactory implements Factory
{
    public Animal createAnimal()
    {
        return new Tiger();
    }
}
