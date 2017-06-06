package chapter05;

public class AfricaFactory implements Factory
{
    public Tiger createTiger()
    {
        return new AfricaTiger();
    }

    public Dolphin createDolphin()
    {
        return new AfricaDophin();
    }

    public Parrot createParrot()
    {
        return new AfricaParrot();
    }
}
