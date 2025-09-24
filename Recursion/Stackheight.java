
import java.util.Scanner;

public class Stackheight {
    public static int calcpower(int x, int n)
    {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xpow1 = calcpower(x, n-1);
        int xpow = x * xpow1;
        return  xpow;
    }    
    public static void main(String[] args) {
        int x, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of X. Which is power => ");
        x = sc.nextInt();
        System.out.println("Enter the value of n. Which is height => ");
        n = sc.nextInt();
        System.out.println("Output is => ");
        int ans = calcpower(x, n);
        System.out.println(ans);
    }
}
