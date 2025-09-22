
import java.util.Scanner;
public class SelectionSort
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        //Accept Size of an array from user
        System.out.println("This is Selection Sort Algorithm");
        System.out.println("Enter the Size of an Array => ");
        int n = sc.nextInt();

        //Accept Elements of an array from user
        System.out.println("Enter Elements Of an Array => ");

        //Creating array of accepted size
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            
        }
        //Slection Sorting

        for(int i=0; i<arr.length-1; i++)
        {
            //Consider first element as a small number
            int smallno = i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[smallno] > arr[j])
                {
                    smallno = j;
                }
            }
            //swap with first number
            int temp = arr[smallno];
            arr[smallno] = arr[i];
            arr[i] = temp;
        }
        
        System.err.println("Sorted Array =>");
        for (int num : arr) {
            System.out.print( " " +num ); //for each element in the arr array, assign its value to a new integer variable called num."
        }
        /* 
        you can also use this simple step to print array
        for (int i = 0; i < arr.length; i++) {
        System.out.print(" " + arr[i]);
        } 
        */
    }
}
    

