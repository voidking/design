package chapter20;

public class NerveDoctor extends Doctor
{
    public void seeDoctor(XiaoGongNew xiaoGongNew)
    {
        if (xiaoGongNew.isHead())
        {
            System.out.println("神经科的医生看病");
        } else if (super.getDoctor() != null)
        {
            super.getDoctor().seeDoctor(xiaoGongNew);
        }
    }
}
