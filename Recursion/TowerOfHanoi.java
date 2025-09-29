
import java.util.Scanner;

public class TowerOfHanoi {
    public static void towerSoln(int n, String src, String helper, String dest)
    {
        if(n == 1)
        {
            System.out.println("Transfer Disk "+n+ " from : "+src+ " => "+dest);
            return;
        }
        towerSoln(n-1, src, dest, helper);
        System.out.println("Transfer Disk "+n+ " from : "+src+ " => "+dest);
        towerSoln(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Disk => ");
        int no = sc.nextInt();
        towerSoln(no, "S", "H", "D");
    }
}
