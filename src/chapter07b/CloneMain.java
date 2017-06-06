package chapter07b;

public class CloneMain
{
    public static void main(String args[])
    {
        DogClone dogClone = new DogClone();
        dogClone.legCounts = 3;
        System.out.println("原来的克隆狗腿数量:" + dogClone.legCounts);
        System.out.println("原来的普通狗腿数量:" + dogClone.dog);

        DogClone dogClone1 = (DogClone)dogClone.clone();
        dogClone1.legCounts = 2;
        Dog dog = dogClone1.dog;
        dog.changeLegCounts();

        System.out.println("克隆后原来的克隆狗腿数量:" + dogClone.legCounts);
        System.out.println("克隆后原来的普通狗腿数量:" + dogClone.dog);
        System.out.println("克隆后的克隆狗腿数量:" + dogClone1.legCounts);
        System.out.println("克隆后的普通狗腿数量:" + dogClone1.dog);
    }
}
