
import java.util.Scanner;

public class Fibonacci {
    public static void printfib(int a, int b, int n)
    {
        if(n==0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        printfib(b, c, n-1);
    }
    public static void main(String[] args) {
        int a = 0 , b = 1;
        Scanner sc  = new Scanner(System.in);
        
        System.out.println("Enter the Number for Fibonacci Series => ");
        int n = sc.nextInt();
        System.out.println("The Fibonacci Series of the number " +n+ " is => ");
        System.out.println(a);
        System.out.println(b);
        printfib(a, b, n-2);
    }
}
