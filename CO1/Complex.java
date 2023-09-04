import java.util.Scanner;
class Complex
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("\n Enter the first complex number real part : ");
		int r1=s.nextInt();
		System.out.print("\n Enter the first complex number imaginary part : ");
		int i1=s.nextInt();
		
		System.out.print("\n Enter the second complex number real part : ");
		int r2=s.nextInt();
		System.out.print("\n Enter the second complex number imaginary part : ");
		int i2=s.nextInt();
		
		System.out.print("\n FIRST COMPLEX NUMBER : " + r1 + " + " + i1 + "i");
		System.out.print("\n FIRST COMPLEX NUMBER : " + r2 + " + " + i2 + "i");
		
		int real=r1+r2;
		int imaginary=i1+i2;
		
		System.out.print("\n SUM OF TWO COMPLEX NUMBERS : " + real + " + " + imaginary + "i");
	}
}