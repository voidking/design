package chapter22;

public class Client
{
    public static void main(String[] args)
    {
        Wine wine = new Wine();
        wine.setCount(10);
        wine.setPrice(20f);

        Pig pig = new Pig();
        pig.setCount(10f);
        pig.setPrice(15f);

        Television television = new Television();
        television.setCount(1);
        television.setPrice(2000f);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(wine);
        shoppingCart.add(pig);
        shoppingCart.add(television);

        AccountMachine accountMachine = new AccountMachine();
        accountMachine.account(shoppingCart.getList());
        System.out.println("本次购物车内所有物品的总价为：" + accountMachine.getAmt());
    }
}
