import java.util.Scanner;
class Area
{
 static double calc(int a)
 {
   return a*a;
  }

 static double calc(int l,int b)
 {
   return l*b;
  }
 static double calc(double x,double y)
 {
   return 0.5*x*y;
 }
}
 class Areas
 {
   public static void main(String[] args)
   {
     Scanner s=new Scanner(System.in);
	 System.out.print("\n AREA OF SQUARE ");
	 System.out.print("\n \n ENTER THE SIDE OF THE SQUARE :  ");
	 int a=s.nextInt();
	 System.out.print("\n AREA OF CUBE IS "+Area.calc(a));
	 System.out.print("\n \n************************************************");
	 System.out.print("\n \n AREA OF RECTANGULAR PRISM ");
	 System.out.print("\n \nENTER THE LENGTH OF THE RECTANGLE :  ");
	 int l=s.nextInt();
	 System.out.print("\n ENTER THE BREADTH OF THE RECTANGLE :  ");
	 int b=s.nextInt();
	 System.out.print("\nAREA OF RECTANGLE IS "+Area.calc(l,b));
	 System.out.print("\n \n************************************************");
	 System.out.print("\n AREA OF TRIANGLE ");
	 System.out.print("\n \nENTER THE LENGTH OF THE TRIANGLE :  ");
	 double x=s.nextDouble();
	 System.out.print("\n ENTER THE BREADTH OF THE TRIANGLE :  ");
	 double y=s.nextDouble();
	 System.out.print("\nAREA OF TRIANGLE IS "+Area.calc(x,y));
   }
}
	 