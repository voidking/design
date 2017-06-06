package chapter14;

public class Client
{
    public static void main(String[] args)
    {
        CompositeDepartment organ = new CompositeDepartment();
        organ.add(new LeafDepartment1());
        System.out.println("该机构人数为" + organ.personCount());

        System.out.println("**********");

        organ = new CompositeDepartment();
        organ.add(new LeafDepartment2());
        System.out.println("该机构人数为" + organ.personCount());

        System.out.println("**********");

        organ = new CompositeDepartment();
        organ.add(new LeafDepartment1());
        organ.add(new LeafDepartment2());
        System.out.println("该机构人数为" + organ.personCount());
    }
}
