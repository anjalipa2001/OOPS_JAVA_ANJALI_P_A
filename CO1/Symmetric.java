import java.util.Scanner;
class Symmetric
{
	public static void main(String[] args)
	{
		int a[][],b[][];
		Scanner s=new Scanner(System.in);
	    System.out.print("\n Enter the rows :");
	    int r=s.nextInt();
		System.out.print("\n Enter the rows :");
		int c=s.nextInt();
		a=new int[r][c];
		b=new int[r][c];
	    System.out.print("\n Enter the elements : \n");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		
		System.out.print("\n_______________________________________\n ");
		System.out.println("\n MATRIX IS, ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			  System.out.print(a[i][j]+"\t");	
			}
			System.out.println();
		}
		
		System.out.println("\n TRANSPOSE OF THE MATRIX IS, ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			  b[i][j]=a[j][i];
			  System.out.print(b[i][j]+"\t");	
			}
			System.out.println();
		}
		int count=1;
	    for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			  if(a[i][j]!=b[i][j])
			  {
				count++;
				break;
			  }
			}
		}
		if(count==1)
		{
		  System.out.println("THE ENTERED MATRIX IS  SYMMETRIC");
		}
		else
		{
			System.out.println("THE ENTERED MATRIX IS NOT SYMMETRIC");
		}
		
	}
}
		
		
		
		