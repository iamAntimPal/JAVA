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
		d=(a>b &&a>c)?a:(b>a&&b>c)?b:(c>a&&c>b)?c:0;
		String f=(d>0)?"Greater is:- "+d:"Equal";
		System.out.println(f);
	}
}
