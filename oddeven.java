import java.util.Scanner;

public class oddeven {
     public static void main(String[] args) {
          Scanner S=new Scanner(System.in);
          int a,b;
          System.out.println("Enter the any number ");
          a=S.nextInt();
          if(a%2==0)
               System.out.println("this number is even");
          else
            System.out.println("this number is odd");

     }
}
