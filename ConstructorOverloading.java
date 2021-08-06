import java.util.*;
class Dis
{
	int s1,s2;
	Dis(int i)
	{
		s1=s2=i;
	}
	Dis(int i,int j)
	{
		s1=i;
		s2=j;
	}
	void display()
	{
		System.out.println(s1+" "+s2);
	}
}
class ConstructorOverloading
{

	public static void main(String args[])
	{
		
		
		
		System.out.println("Enter 2 integers:");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		Dis m1=new Dis(i);
		Dis m2=new Dis(i,j);
		
		m1.display();
		
		m2.display();
		
	}
}