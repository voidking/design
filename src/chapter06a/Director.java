package chapter06a;

public class Director {

	private Builder builder;
	public void Director(Builder builder)
	{
		this.builder = builder;
	}
	public Product assembleProduct()
	{
		return new Product1();
	}
}
