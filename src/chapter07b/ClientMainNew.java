package chapter07b;

public class ClientMainNew
{
    public static void main(String args[])
    {
        NewDogClone newDogClone = new NewDogClone();
        newDogClone.legCounts = 3;
        System.out.println("原来的克隆狗腿数量：" + newDogClone.legCounts);
        System.out.println("原来的普通狗腿数量：" + newDogClone.newDog);

        NewDogClone newDogClone1 = (NewDogClone)newDogClone.clone();
        newDogClone1.legCounts = 2;
        NewDog newDog = newDogClone1.newDog;
        newDog.ChangeLegCounts();

        System.out.println("克隆后原来的克隆狗腿数量："+ newDogClone.legCounts);
        System.out.println("克隆后原来的普通狗腿数量：" + newDogClone.newDog);
        System.out.println("克隆后的克隆狗腿数量："+ newDogClone1.legCounts);
        System.out.println("克隆后的普通狗腿数量：" + newDogClone1.newDog);
    }
}
