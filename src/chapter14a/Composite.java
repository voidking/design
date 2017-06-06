package chapter14a;

import java.util.Enumeration;
import java.util.Vector;

public class Composite implements Component
{
    public Composite getComposite()
    {
        return this;
    }

    public void sampleOperation()
    {
        Enumeration components = components();
        while (components.hasMoreElements())
        {
            ((Component) components.nextElement()).sampleOperation();
        }
    }

    public void add(Component component)
    {
        componentVector.addElement(component);
    }

    public void remove(Component component)
    {
        componentVector.remove(component);
    }

    public Enumeration components()
    {
        return componentVector.elements();
    }

    private Vector componentVector = new Vector();
}
