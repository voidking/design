package chapter13a;

public abstract class Car
{
    Manufacturer lnkManufacturer;

    protected Car(Manufacturer lnkManufacturer)
    {
        this.lnkManufacturer = lnkManufacturer;
    }

    public void produce()
    {
        lnkManufacturer.produce();
    }
}
