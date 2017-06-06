package chapter23a;

public class Client
{
    public static void main(String[] args)
    {
        Chat chat = new ChatImpl();
        PersonANew personA = new PersonANew();
        PersonBNew personB = new PersonBNew();
        chat.add(personA);
        chat.add(personB);
        personA.sendMessage("A", "B", "Hello");
    }
}
