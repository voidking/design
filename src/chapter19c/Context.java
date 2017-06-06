package chapter19c;

public class Context
{
    private Strategy lnkStrategy;

    public void operation()
    {
        lnkStrategy.operation();
    }
}
