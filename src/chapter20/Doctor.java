package chapter20;

public abstract class Doctor
{
    public abstract void seeDoctor(XiaoGongNew xiaoGongNew);

    public Doctor getDoctor()
    {
        return doctor;
    }

    public void setDoctor(Doctor doctor)
    {
        this.doctor = doctor;
    }

    private Doctor doctor;
}
