package chapter07b;

public class DogClone implements Cloneable
{
    public int legCounts;

    public Dog dog = new Dog(4);

    public Object clone()
    {
        DogClone o = null;

        try
        {
            o = (DogClone)super.clone();
        }
        catch (CloneNotSupportedException ex)
        {
            ex.printStackTrace();
        }
        return o;
    }
}
