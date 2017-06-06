package chapter18b;
public class Context
{
    public void sampleOperation()
    {
        state.sampleOperation();
    }

    public void setState(State state)
    {
        this.state = state;
    }

    private State state;
}
