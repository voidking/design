package chapter18a;

public class DocumentState
{
    public DocumentState()
    {
        state = new CreatingState();
    }

    public State getState()
    {
        return state;
    }

    public void setState(State state)
    {
        this.state = state;
    }

    private State state;

    public void handle()
    {
        state.handle(this);
    }
}
