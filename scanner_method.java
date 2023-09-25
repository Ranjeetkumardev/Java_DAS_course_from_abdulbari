import  java.util.*;
public class scanner_method{
    public static void main(String arg[]){
        Scanner s = new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers ");
        a = s.nextInt();
        b = s.nextInt();
        int c = a+b;
        System.out.println("Sum of Two No is " + c);

    }
}