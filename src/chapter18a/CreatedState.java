package chapter18a;

public class CreatedState implements State
{
    public void handle(DocumentState documentState)
    {
        documentState.setState(new SendOneChargeState());
        System.out.println("公文已发送二级主管");
    }
}
