
import java.util.Scanner;

public class ReverseString {
    public static void printreverse(String str, int idx)
    {
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printreverse(str, idx-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to print in revrse => ");
        String new_string = sc.nextLine();
        printreverse(new_string, new_string.length()-1);
    }
}
