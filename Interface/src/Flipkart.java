import java.util.Random;
import java.util.Scanner;

public class Flipkart 
{
void sell()
{
	Random r = new Random();
	int opt = r.nextInt(3)+1;
	Scanner s =new Scanner(System.in);
	System.out.println("enter the name");
	String s1 = s.nextLine();
	System.out.println("enter the phone number");
	long s2 = s.nextLong();
	s.nextLine();
	System.out.println("enter the address");
	String s3 = s.nextLine();
	if(opt == 1)
	{
		DHL d =new DHL();
		d.deliverProduct(s1, s2, s3);
	}
	else if(opt == 2)
	{
		FedEximpl fd= new FedEximpl();
		fd.deliverProduct(s1, s2, s3);
	}
	
	else
	{
		IndianPost ip = new IndianPost();
		ip.deliverProduct(s1, s2, s3);
	}
	
	
}
}
