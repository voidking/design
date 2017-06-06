package chapter06;


public class MotorcycleFactory implements Factory
{
    public Carcase createCarcase()
    {
        return new Carcase1();
    }

    public Wheel createWheel()
    {
        return new Wheel1();
    }

    public Tyre createTyre()
    {
        return new Tyre1();
    }

    public Engine createEngine()
    {
        return new Engine1();
    }
}
