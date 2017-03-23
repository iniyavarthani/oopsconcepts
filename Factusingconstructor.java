package lesson1;

public class Factusingconstructor {
	int a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factusingconstructor f1=new Factusingconstructor(4);
		int b=f1.factorial();
		System.out.println("factorial is"+b);
		
		Factusingconstructor f2=new Factusingconstructor(5);
		int c=f2.factorial();
		System.out.println("factorial is"+c);
		Factusingconstructor fib=new Factusingconstructor(5);
		fib.fibonacies();
		
	}
	Factusingconstructor(int k)
	{
		a=k;
	}
	
	int factorial(){
		int fact=1;
		for(int i=1; i<=a;i++)
		{
			
			
			fact=fact*i;
				
		}
		return(fact);
	}
	int fibonacies()
	{
		int d=0,e=1,f=0;
		System.out.println(+d+""+e);
		for(int j=2;j<=5;j++)
		{
			f=d+e;
			System.out.println(""+f);
			d=e;
			e=f;
		}
		return(f);
}
}
