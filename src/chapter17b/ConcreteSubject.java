package chapter17b;

import java.util.Enumeration;
import java.util.Vector;

public class ConcreteSubject implements Subject
{
    public void attach(Observer observer)
    {
        observersVector.addElement(observer);
    }

    public void detach(Observer observer)
    {
        observersVector.removeElement(observer);
    }

    public void inform()
    {
        Enumeration enumeration = observers();
        while (enumeration.hasMoreElements())
        {
            ((Observer) enumeration.nextElement()).update();
        }
    }

    public Enumeration observers()
    {
        return ((Vector) observersVector.clone()).elements();
    }

    private Vector observersVector = new Vector();
}
