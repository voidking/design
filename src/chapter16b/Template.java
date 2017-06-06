package chapter16b;
public abstract class Template
{
    public void TemplateMethod()
    {
        Operation1();
        Operation2();
        Operation3();
    }

    public abstract void Operation1();

    public abstract void Operation2();

    public abstract void Operation3();
}
