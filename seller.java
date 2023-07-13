import java.util.Scanner;

public class seller {
     public static void main(String[] args) {
          Scanner S=new Scanner(System.in);
		int a,b,c;
          System.out.println("Enter the net prise");
          a=S.nextInt();
          System.out.println("Enter the Seller price");
          b=S.nextInt();
          if(a>b)
               c=a-b;
          else
               c=b-a;
          if(a>b)
			System.out.println("Loss :-"+c);
		else
			System.out.println("Profit is :-"+c);
          
     }
}
