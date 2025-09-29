
import java.util.Scanner;

public class StringElementOccur {
    public static int first = -1;
    public static int last = -1;
    public static void findoccurence(String str, int idx, char element)
    {
        if(idx == str.length()){
            System.out.println("First Occurance Index => "+first);
            System.out.println("Last Occurance Index => "+last);
            return;
        }
        char ccurrchar = str.charAt(idx);
        if(ccurrchar == element){
            if(first == -1){
                first = idx;
            }
            else{
                last = idx;
            }
        }
        findoccurence(str, idx+1, element);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String => ");
        String new_String = sc.nextLine();
        System.out.println("Enter the Character to check in String => ");
       char ele = sc.next().charAt(0);  // ✅ read only one character
        System.out.println("The Occurence of an Element is => ");
        findoccurence(new_String, 0, ele);
    }
}
