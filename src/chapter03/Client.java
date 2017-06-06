package chapter03;


public class Client
{
    public static void main(String args[])
    {
        Animal animal = SampleFactory.createAnimal("Tiger");
        animal.eat();
        animal = SampleFactory.createAnimal("Dolphin");
        animal.eat();
        animal = SampleFactory.createAnimal("Parrot");
        animal.eat();
        
        Tiger tiger = (Tiger)SampleFactory.createAnimal("Tiger");
        tiger.run();
    }
}
