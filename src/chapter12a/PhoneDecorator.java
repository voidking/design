package chapter12a;

public abstract class PhoneDecorator implements Phone
{
    private Phone phone;

    protected PhoneDecorator(Phone phone)
    {
        this.phone = phone;
    }

    public void call(String name)
    {
        this.phone.call(name);
    }
}
