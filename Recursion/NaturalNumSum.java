
import java.util.Scanner;



public class NaturalNumSum {

    public static void printsum(int i, int n, int sum){
        
        if(i==n)
        {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum +=i;
        printsum(i+1, n, sum);

    }
    public static void main(String[] args) {
        System.out.println("Enter Value for the sum from 1 to =>");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int firstnum = 1;
        printsum(firstnum, num, sum);
    }
    
}
