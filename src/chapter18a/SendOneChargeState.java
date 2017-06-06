package chapter18a;

public class SendOneChargeState implements State
{
    public void handle(DocumentState documentState)
    {
        documentState.setState(new SendSuperChargeState());
        System.out.println("公文已发送一级主管");
    }
}
