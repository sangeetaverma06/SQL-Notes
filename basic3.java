import java.util.Scanner;
public class basic3 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
         float a;
         float b;
         System.out.println("Enter a floating number");
         a=sc.nextFloat();
         System.out.println("Enter second value");
         b=sc.nextFloat();
         System.out.println("Sum of float value = "+(a+b));
    }
}
