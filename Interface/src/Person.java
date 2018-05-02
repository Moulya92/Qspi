
public class Person {
	void purchase()
	{
		System.out.println("open the flipkart website and order");
		Flipkart f =new Flipkart();
		System.out.println("requesting flipkart to sell the product");
		f.sell();
	}
	
	public static void main(String[] args) 
	{
	System.out.println("person wants to order");
	Person p = new Person();
	System.out.println("he wants to purchase");
	p.purchase();
	}

}
