package chapter18a;

public class CreatingState implements State
{
    public void handle(DocumentState documentState)
    {
        documentState.setState(new CreatedState());
        System.out.println("公文已创建完成");
    }
}
