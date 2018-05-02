
public class DHL implements Ideliver {

	@Override
	public void deliverProduct(String name, long phone, String address) {
		System.out.println("DHL Delivered the product to"+" " + name +" "+phone+" "+address);
	}
	
	

}
