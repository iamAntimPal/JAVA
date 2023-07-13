//find greater between two numbers
import java.util.*;
class testGreaterifelse
{
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter 2 numbers");
		a=S.nextInt();
		b=S.nextInt();
		if(a>b)
			System.out.println("Result:-"+a);
		else
			System.out.println("Result:-"+b);
	}
}