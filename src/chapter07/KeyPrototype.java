package chapter07;

public class KeyPrototype implements Cloneable
{
    private float length;
    private float thick;
    private String color;

    public float getLength()
    {
        return length;
    }

    public void setLength(float length)
    {
        this.length = length;
    }

    public float getThick()
    {
        return thick;
    }

    public void setThick(float thick)
    {
        this.thick = thick;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public Object clone()
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
