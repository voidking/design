package chapter04;

public class DolphinFactory implements Factory
{
    public Animal createAnimal()
    {
        return new Dolphin();
    }
}
