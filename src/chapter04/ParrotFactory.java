package chapter04;


public class ParrotFactory implements Factory
{
    public Animal createAnimal()
    {
        return new Parrot();
    }
}
