import java.util.Scanner;

public class pattern1 {
        public static void main(String[] args) {
          Scanner S=new Scanner(System.in);
          System.out.println("Enter the number ");
          int n=S.nextInt();
          int a,b,d;
          d=1;
          char c;
          for(a=1;a<=n;a++)
          {
               for (b = 0; b < a; b++)
                {
                    System.out.print(" ");
               }
               for(c=1;c<=n;c++)
               {
                    System.out.print(c);
               }
               System.out.println();
          }
     }
     
}
