package chapter25a;

public class ConcreteAggregate implements Aggregate
{
    public Iterator CreateIterator()
    {
        return new ConcreteIterator();
    }
}
