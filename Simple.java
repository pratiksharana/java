import java.util.*;
class Simple
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		double p;
		double t;
		double r;
		double interest;
		System.out.println("enter the principle, time and rate");
		p=scan.nextDouble();
		t=scan.nextDouble();
		r=scan.nextDouble();
		interest=p*t*r/100;
		System.out.println("simple intrest is"+interest);
	}
}