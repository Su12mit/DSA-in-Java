import java.util.*;
public class FactorialNumber {
    public static int calc(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int n_fact = calc(n - 1);
        int fact = n * n_fact;
        return fact;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to calculate its factorial => ");
        int newnum = sc.nextInt();
        int output = calc(newnum);
        System.out.println(output);
    }
}