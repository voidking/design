package chapter13a;

public class Truck extends Car
{
    protected Truck(Manufacturer lnkManufacturer)
    {
        super(lnkManufacturer);
    }

    public void produce()
    {
        lnkManufacturer.produce();
        System.out.println("的货车");
    }
}
