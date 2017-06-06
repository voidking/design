package chapter03;

public class SampleFactory
{
    public static Animal createAnimal(String animalName)
    {
        if ("Tiger".equals(animalName))
        {
            return new Tiger();
        }
        else if ("Dolphin".equals(animalName))
        {
            return new Dolphin();
        }
        else if ("Parrot".equals(animalName))
        {
            return new Parrot();
        }
        return null;
    }
}
