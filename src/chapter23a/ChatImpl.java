package chapter23a;

import java.util.HashMap;
import java.util.Map;

public class ChatImpl implements Chat
{
    private Map map = new HashMap();

    public void send(String personFrom, String personTo, String message)
    {
        Person personF = (Person) map.get(personFrom);
        Person personT = (Person) map.get(personTo);
        personT.receiveMessage(personF, message);
    }

    public void add(Person person)
    {
        person.setChat(this);
        map.put(person.getName(), person);
    }
}
