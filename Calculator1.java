package week1.day1;
import java.lang.*;
public class Calculator1 {

	public int add1(int a,int b)
	{
		return a+b;
	}
	public int add2(int a,int b,int c)
	{
		return a+b+c;
	}
public int mul1(int a,int b) {
	return a*b;
}
public double mul2(int a, double b)
{
	return a*b;
}
public int sub1(int a,int b)
{
	return a-b;
}
public double sub2(double a,double b)
{
	return a-b;
	
}
public int divide1(int a,int b)
{
	return a/b;
}
public double divide2(double a,int b)
{
	return a/b;
}
public static void main(String[] args) {
	Calculator1 cal1=new Calculator1();
	System.out.println("the add of two intergers "+cal1.add1(5, 8));
	System.out.println("the add of three intergs"+cal1.add2(5, 5, 8));
	System.out.println("the mul of two integers"+cal1.mul1(5, 8));
	System.out.println("the mul of int and double variables"+cal1.mul2(5, 8.2));
	System.out.println("the sub of two integers"+cal1.sub1(8, 5));
	System.out.println("the sub of two double variables"+cal1.sub2(8.2, 6.8));
	System.out.println("the division of two integers"+cal1.divide1(10, 5));
	System.out.println("the division of double and integers"+cal1.divide2(5.2, 2));
	}
}











