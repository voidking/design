package chapter07b;

public class NewDogClone implements Cloneable
{
    public int legCounts;

    public NewDog newDog = new NewDog(4);

    public Object clone()
    {
        NewDogClone o = null;

        try
        {
            o = (NewDogClone)super.clone();
        }
        catch (CloneNotSupportedException ex)
        {
            ex.printStackTrace();
        }
        o.newDog = (NewDog)newDog.clone();
        return o;
    }
}
