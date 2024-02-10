package examples;

class CPU
{
	double price;
	class Processor
	{
		double corse;
		String manufactor;
		
		double getCache() {
			return 5.3;
		}
	}
	protected class RAM{
		double memory;
		String manufactor;
		
		double getClockSpeed()
		{
			return 6.5;
		}
	}
}

public class Main_NestedClass 
{
	public static void main(String[] args) {
		CPU cpu=new CPU();
		
		CPU.Processor processor=cpu.new Processor();
		CPU.RAM ram=cpu.new RAM();
		
		System.out.println("Processor "+processor.getCache());
		System.out.println("Ram clock speed "+ram.getClockSpeed());
		
	}
}
