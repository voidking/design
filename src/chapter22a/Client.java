package chapter22a;

public class Client
{
    public static void main(String[] args)
    {
        WineNew wine = new WineNew();
        wine.setCount(10);
        wine.setPrice(20f);

        PigNew pig = new PigNew();
        pig.setCount(10f);
        pig.setPrice(15f);

        TelevisionNew television = new TelevisionNew();
        television.setCount(1);
        television.setPrice(2000f);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.add(wine);
        shoppingCart.add(pig);
        shoppingCart.add(television);

        AccountMachineNew accountMachine = new AccountMachineNew();
        accountMachine.account(shoppingCart.getList());
        System.out.println("本次购物车内所有的物品的总价为：" + accountMachine.getAmt());
    }
}
