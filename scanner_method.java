import  java.util.*; 
/* class Scanner 
1.nextInt() -> Taking input as a integers
2.nextFloat() -> Taking input as a Floats
3.nextDouble() -> Taking input as a Doubles
4.next() -> Taking input as a Strings/i.e just one word 
5.nextLine() -> Taking input as a Sentence/Line 
6.nextByte() -> 
7.nextShort() -> 
8.nextLong() -> 
9.nextBoolean() -> 
10.hasnextInt() -> it check ip data is integer or not i.e op true/false
11.hasnextFloat() ->
 use this keyword javap java.util.Scanner in terminal you got all Scanner methods
 */
public class scanner_method{
    public static void main(String arg[]){
        Scanner s = new Scanner(System.in);
        // int a,b;
        // System.out.println("Enter two numbers ");
        // a = s.nextInt();
        // b = s.nextInt();// if u give i/p a float value u got error 
        // int c = a+b;
        // System.out.println("Sum of Two No is " + c);
     String name;
      System.out.println("May I know your Name please!");
       name = s.nextLine();
       System.out.println("Welcome Mr/Mis" + " " +  name);

    }
}