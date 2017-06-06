package chapter05;

public class Client
{
    public static void main(String args[])
    {
        Factory factory = new AsiaFactory();
        Animal animal = factory.createTiger();
        animal.eat();
        animal = factory.createDolphin();
        animal.eat();
        animal = factory.createParrot();
        animal.eat();

        factory = new AfricaFactory();
        animal = factory.createTiger();
        animal.eat();
        animal = factory.createDolphin();
        animal.eat();
        animal = factory.createParrot();
        animal.eat();
    }
}
