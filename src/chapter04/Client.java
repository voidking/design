package chapter04;


public class Client
{
    public static void main(String args[])
    {
        Factory factory = new TigerFactory();
        Animal animal = factory.createAnimal();
        animal.eat();
        factory = new DolphinFactory();
        animal = factory.createAnimal();
        animal.eat();
        factory = new ParrotFactory();
        animal = factory.createAnimal();
        animal.eat();
    }
}
