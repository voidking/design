package chapter23a;

public class PersonANew extends Person
{
    private String name;

    public void receiveMessage(Person personFrom, String message)
    {
        System.out.println(personFrom.getName() + "向" + getName() + "发送来了消息，消息的内容是：" + message);
    }

    public String getName()
    {
        return "A";
    }
}
