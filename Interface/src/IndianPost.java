
public class IndianPost implements Ideliver
{

	@Override
	public void deliverProduct(String name, long phone, String address) {
		System.out.println("IP Delivered the product to"+" " + name +" "+phone+" "+address);
		
	}

}
