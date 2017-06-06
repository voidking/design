package chapter09;

public class OtherSystem
{
    public static void main(String[] args)
    {
        Facade facade = new ConcreteFacade();
        facade.operation1();
        facade.operation2();
    }
}
