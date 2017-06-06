package chapter23a;

public abstract class Person
{
    public void sendMessage(String personFrom, String personTo, String messgae)
    {
        chat.send(personFrom, personTo, messgae);
    }

    public abstract void receiveMessage(Person personFrom, String message);

    public abstract String getName();

    public void setChat(Chat chat)
    {
        this.chat = chat;
    }

    private Chat chat;
}