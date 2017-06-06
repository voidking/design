package chapter23;

public class PersonA
{
    public void sendMessage()
    {
        PersonB personB = new PersonB();
        personB.receiveMessge();

        PersonC personC = new PersonC();
        personC.receiveMessge();
    }

    public void sendBMessage()
    {
        PersonB personB = new PersonB();
        personB.receiveMessge();
    }

    public void sendCMessage()
    {
        PersonC personC = new PersonC();
        personC.receiveMessge();
    }

    public void receiveMessge()
    {

    }
}
