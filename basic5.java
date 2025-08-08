import java.util.Scanner;
public class basic5 {
     public static void main(String args[])
     {
        Scanner ob =new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter a first value ");
        a=ob.nextInt();
        System.out.println("Enter second value");
        b=ob.nextInt();

        System.out.println("a = "+a);         
        System.out.println("b= "+b);

        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("a = "+a);
        System.out.println("b ="+b);
     }    
}
