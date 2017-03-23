package lesson1;

import java.util.Scanner;

public class SwitchCaseCalculator {
	
	public static void main(String[] args) {
		int n1,n2,c;
		System.out.println("enter a and b value");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		System.out.println("calculator");
		System.out.println("1.Addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println("5.exist");
		int calci;
		calci=sc.nextInt();
		switch(calci)
		{
		case 1:
			c=add(n1,n2);
			System.out.println("addition is"+c);
			break;
		case 2:
			c=sub(n1,n2);
			System.out.println("substration  is"+c);
			break;
		case 3:
			c=mul(n1,n2);
			System.out.println("multiplication is"+c);
			break;
		case 4:
			c=div(n1,n2);
			System.out.println("division is"+c);
			break;
			default:
				System.out.println("exist");
				return;
		
		}}
	public static int add(int a,int b)
	{
		return (a+b);
	}
	public static int sub(int a,int b)
	{
		return(a-b);
	}
	public static int mul(int a,int b)
	{
		return(a*b);
	}
	public static int div(int a,int b)
	{
		if(b==0)
		{
	System.out.println("the number cannot be 0");
	return 0;
	}
	else
	{
		return(a/b);
	}
	}
}
	
	

	