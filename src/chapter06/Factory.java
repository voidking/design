package chapter06;


public interface Factory
{
    Carcase createCarcase();
    Wheel createWheel();
    Tyre createTyre();
    Engine createEngine();
}