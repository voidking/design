package chapter12b;

public class Decorator implements Component
{
    private Component component;

    public Decorator(Component component)
    {
        super();
        this.component = component;
    }

    public void sampleOperation()
    {
        component.sampleOperation();
    }
}
