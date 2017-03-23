package lesson1;

public class Interface implements InterfaceOne,InterfaceTwo {
	
	
	public void mul()
	{
		int a=4,b=3;
		System.out.println(a*b);
	}
	public void div()
	{
		int c=10,d=5;
		System.out.println(c/d);
	}
	public static void main(String[] args) {
		Interface 1=new Interface();
		Interface 2=new Interface();
		
		
		
}
}