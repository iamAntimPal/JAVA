//greater between 3 numbers
/*
a=3,b=4,c=5
a=>a>b, a>c 
b=>b>a, b>c
c=>c>a, c>b
equal
*/
import java.util.*;
class testGreater3
{
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int a,b,c,d;
		System.out.println("Enter 3 numbers");
		a=S.nextInt();
		b=S.nextInt();
		c=S.nextInt();
		if(a>b && a>c)
			System.out.println("Result:-"+a);
		else if(b>a && b>c)
			System.out.println("Result:-"+b);			
		else if(c>a && c>b)
			System.out.println("Result:-"+c);			
		else
			System.out.println("All Equal");			
	}
}
