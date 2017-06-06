package chapter05a;

public class ConcreteFactory implements AbstractFactory
{
    public AbstractProduct createAbstractProduct()
    {
        return new ConcreteProduct();
    }
}
