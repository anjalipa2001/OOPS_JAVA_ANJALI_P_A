import java.util.Scanner;
class CPU
{
	int price;
	class Processor
	{
		int cores;
		String manufacturer;
		Processor(int cores,String manufacturer)
		{
			this.cores=cores;
			this.manufacturer=manufacturer;
		}
		void display()
		{
			System.out.print("\n Processor cores : "+cores);
			System.out.print("\n Processor manufacturer : "+manufacturer);
		}
	}
	static class RAM
	{
		int memory;
		String manufacturer;
		RAM(int memory,String manufacturer)
		{
			this.memory=memory;
			this.manufacturer=manufacturer;
		}
		void display()
		{
			System.out.print("\n RAM memory : "+memory);
			System.out.print("\n RAM manufacturer : "+manufacturer);
		}
	}
	CPU(int price)
	{
		this.price=price;
	}
	void display()
	{
		System.out.print("\n CPU Price : "+price);
	}
}
class Inner
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("\n Enter CPU price : ");
		int price=s.nextInt();
		
		CPU cpu=new CPU(price);
		
		System.out.print("\n Enter the Processor number of cores : ");
		int cores=s.nextInt();
		System.out.print("\n Enter the Processor Manufacturer name : ");
		String pmanufacturer=s.next();
		
		CPU.Processor processor=cpu.new Processor(cores,pmanufacturer);
		
		System.out.print("\n Enter the RAM memory : ");
		int memory=s.nextInt();
		System.out.print("\n Enter the RAM Manufacturer name : ");
		String rmanufacturer=s.next();
		
		CPU.RAM ram=new CPU.RAM(memory,rmanufacturer);
		System.out.println("\n ______________________________________________________\n");
		System.out.print("\n CPU INFORMATIONS ");
		cpu.display();
		System.out.println("");
		System.out.print("\n PROCESSOR INFORMATIONS ");
		processor.display();
		System.out.println("");
		System.out.print("\n RAM INFORMATIONS ");
		ram.display();
	}
}
		
		
		
		
		
		
		
		