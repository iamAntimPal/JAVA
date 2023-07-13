import java.util.Scanner;


public class symbol {
     public static void main(String[] args) {
          Scanner S = new Scanner(System.in);
          System.out.println("Enter the number ");
          int n = S.nextInt();
          int a, b, d = 0;
          char c;
          char e=65;
          for (a = e; a <= e+ n; a++) {
               for (b = e; b <= a; b++) {
                    System.out.print(" ");
               }
               for (c = e; c <= (e + n) - d; c++) {
                    System.out.print(c);
               }
               d++;
               System.out.println();
          }
     }

}
