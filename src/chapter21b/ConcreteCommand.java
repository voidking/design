package chapter21b;

public class ConcreteCommand implements Command
{
    public void execute()
    {
        receiver.action();
    }

    private Receiver receiver;
}
