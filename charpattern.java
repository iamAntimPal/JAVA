import java.util.Scanner;

public class charpattern {
     public static void main(String[] args) {
          Scanner S=new Scanner(System.in);
          int a,b,d=0;
          char c;

          for(a=97; a<=102; a++)
          {
                for(b=97; b<=a; b++)
               {
                    System.out.print(" ");
               }
               for(c=97; c<=102-d;c++)
               {
                    System.out.print(c);
               }
               d++;
               System.out.println();
          }
     }
}
