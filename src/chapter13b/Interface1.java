package chapter13b;

public class Interface1 extends Interface
{
    protected Interface1(Implement implement)
    {
        super(implement);
    }

    public void Operation()
    {
        implement.Operation();
    }
}
