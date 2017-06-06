package chapter04a;

public class ConcreteCreator implements Creator
{
    public Product factoryMethod()
    {
        return new ConcreteProduct();
    }
}
