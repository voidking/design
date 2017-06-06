package chapter13b;

public abstract class Interface
{
    Implement implement;

    protected Interface(Implement implement)
    {
        this.implement = implement;
    }

    public void Operation()
    {
        implement.Operation();
    }
}
