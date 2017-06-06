package chapter13a;

public class Bus extends Car
{
    protected Bus(Manufacturer lnkManufacturer)
    {
        super(lnkManufacturer);
    }

    public void produce()
    {
        lnkManufacturer.produce();
        System.out.println("的公共汽车");
    }
}
