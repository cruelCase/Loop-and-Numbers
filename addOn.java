import java.util.Scanner;
public class Main {
      public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int i = 1;
        int a = 0;
        int b = 0;
        
        do { a += b;
     System.out.print("Enter number " + i++ + ": ");
        b = input.nextInt();
        } 
        while(b>=1); 
           System.out.println("You entered " + (i-2) + " numbers");
           System.out.println("The sum of the total numbers is: " + a);
        }
}