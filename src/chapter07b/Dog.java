package chapter07b;

public class Dog
{
    public int legCounts;

    public Dog(int legCounts)
    {
        this.legCounts = legCounts;
    }

    public void changeLegCounts()
    {
        this.legCounts *= 2;
    }

    public String toString()
    {
        return Integer.toString(this.legCounts);
    }
}
