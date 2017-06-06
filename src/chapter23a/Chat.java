package chapter23a;

public interface Chat
{
    void send(String personFrom, String personTo, String message);

    void add(Person person);
}
