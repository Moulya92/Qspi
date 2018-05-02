
public class FedEximpl implements Ideliver
{

	@Override
	public void deliverProduct(String name, long phone, String address) {
		System.out.println("FedExDelivered the product to"+" " + name +" "+phone+" "+address);
		
	}
	

}
