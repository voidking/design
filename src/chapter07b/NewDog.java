package chapter07b;

public class NewDog implements Cloneable
{
    public int legCounts;

    public NewDog(int legCounts)
    {
        this.legCounts = legCounts;
    }

    public void ChangeLegCounts()
    {
        this.legCounts *= 2;
    }

    public String toString()
    {
        return Integer.toString(this.legCounts);
    }

    public Object clone()
    {
        NewDog o = null;
        try
        {
            o = (NewDog)super.clone();
        }
        catch (CloneNotSupportedException ex)
        {
            ex.printStackTrace();
        }
        return o;
    }
}
