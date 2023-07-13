          import java.util.Scanner;


public class char1pattern {
     public static void main(String[] args) {
          Scanner S = new Scanner(System.in);
          System.out.println("Enter the number ");
          int n = S.nextInt();
          int a, b, d = 0;
          char c;
          for (a = 97; a <= 97+n; a++) {
               for (b = 97; b <= a; b++) {
                    System.out.print(" ");
               }
               for (c = 97; c <= (97+n) - d; c++) {
                    System.out.print(c);

               }
               d++;
               System.out.println();
          }
     }
}
