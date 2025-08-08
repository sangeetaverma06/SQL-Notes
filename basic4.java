import java.util.Scanner;
public class basic4 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a charactor ");
        char ch='b';
         int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " +ch);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}
