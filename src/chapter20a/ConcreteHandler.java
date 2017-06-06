package chapter20a;

public class ConcreteHandler extends Handler
{
    public void handleRequest()
    {
        if (getSuccessor() != null)
        {
            getSuccessor().handleRequest();
        }
        if (successor != null)
        {
            successor.handleRequest();
        }
    }
}
