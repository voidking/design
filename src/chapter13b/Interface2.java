package chapter13b;

public class Interface2 extends Interface
{
    protected Interface2(Implement implement)
    {
        super(implement);
    }

    public void Operation()
    {
        implement.Operation();
    }
}
