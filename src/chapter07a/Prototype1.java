package chapter07a;

public class Prototype1 implements Prototype
{
    public Object Clone()
    {
        Object obj = null;

        try
        {
            obj = super.clone();
        }
        catch (CloneNotSupportedException ex)
        {
            System.out.println(ex);
        }
        return obj;
    }
}
