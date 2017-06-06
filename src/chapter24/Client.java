package chapter24;

public class Client
{
    public static void main(String[] args)
    {
        Cahier cahier = new Cahier();
        cahier.setName("公司销售会议");
        cahier.setContent("有关销售价格的会议内容");
        cahier.setPersons("总经理、销售处长");
        System.out.println("原来的内容" + cahier.getName() + "："+ cahier.getContent() + "：" + cahier.getPersons());
        Memento memento = cahier.getMemento();
        cahier.setName("公司办公会议");
        cahier.setContent("有关员工稳定的会议内容");
        cahier.setPersons("董事长、总经理、人事副总");
        System.out.println("修改后的内容" + cahier.getName() + ":"+ cahier.getContent() + ":" + cahier.getPersons());
        cahier.setMemento(memento);
        System.out.println("恢复到原来的内容" + cahier.getName() + "："+ cahier.getContent() + ":"+ cahier.getPersons());
    }
}
