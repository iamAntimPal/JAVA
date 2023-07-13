import java.util.Scanner;

public class pattern {
        public static void main(String[] args) {
          Scanner S=new Scanner(System.in);
          System.out.println("Enter the number ");
          int n=S.nextInt();
          int a,b,c,d;
          for(a=1;a<=n;a++)
          {
               for(c=n; c>=a;c--)
               {
                    System.out.print(c);
               }
               System.out.println();
          }
     }
     
}
