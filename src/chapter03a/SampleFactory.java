package chapter03a;

public class SampleFactory
{
    public static Product createProduct(String productName)
    {
        if ("1".equals(productName))
        {
            return new Product1();
        }
        else if ("2".equals(productName))
        {
            return new Product2();
        }
        return null;
    }
}
