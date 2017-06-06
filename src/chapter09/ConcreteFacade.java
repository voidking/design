package chapter09;

public class ConcreteFacade implements Facade
{
    public void operation1()
    {
        SubSystem subSystem = new SubSystem();
        subSystem.operation1();
    }

    public void operation2()
    {
        SubSystem subSystem = new SubSystem();
        subSystem.operation2();
    }
}
