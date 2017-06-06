package chapter05;

public class AsiaFactory implements Factory
{
    public Tiger createTiger()
    {
        return new AsiaTiger();
    }

    public Dolphin createDolphin()
    {
        return new AsiaDophin();
    }

    public Parrot createParrot()
    {
        return new AsiaParrot();
    }
}
