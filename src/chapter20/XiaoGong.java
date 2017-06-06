package chapter20;

public class XiaoGong
{
    private String symptom;

    public void seeDoctor()
    {
        if (symptom.equals("小巩头痛"))
        {
            System.out.println("去神经科看病");
        } else if (symptom.equals("小巩睡眠不好"))
        {
            System.out.println("去睡眠中心看病");
        } else if (symptom.equals("小巩消化不好"))
        {
            System.out.println("去消化科看病");
        } else if (symptom.equals("小巩……不好"))
        {
            System.out.println("去……科看病");
        }
    }
}
