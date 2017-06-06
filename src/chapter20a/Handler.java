package chapter20a;

public class Handler
{
    public Handler getSuccessor()
    {
        return successor;
    }

    public void setSuccessor(Handler successor)
    {
        this.successor = successor;
    }

    protected Handler successor;

    public void handleRequest()
    {
        if (successor != null)
        {
            successor.handleRequest();
        }
    }
}
