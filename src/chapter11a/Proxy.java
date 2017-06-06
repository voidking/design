package chapter11a;

public class Proxy implements Subject
{
    private RealSubject lnkRealSubject;

    public void sampleOperation()
    {
        lnkRealSubject.sampleOperation();
    }
}
