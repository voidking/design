package chapter22b;

public class ConcreteElement implements Element
{
    public void accept(Visitor visitor)
    {
        visitor.visitConcreteElement(this);
    }
}
