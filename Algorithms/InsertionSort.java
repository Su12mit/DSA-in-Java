
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Accept Length of an array from user
        System.out.println("THis is Insertion sort Algorithm =>");
        System.out.print("Enter length of an array =>");
        int n =sc.nextInt();

        // crating an array of accepted size
        int arr[] = new int[n];

        // Accepting Elements for an array
        System.out.println("Enter the elements of an array=>");
        for(int i=0; i<arr.length; i++)
        {
            int cnt = i+1;
            System.out.print(cnt+") Element =>");
            arr[i]=sc.nextInt();
        }
        //Time complexity O(n^2)
        //Insertion Sort
        for(int i = 1; i<arr.length; i++)
        {
            int currentno = arr[i];
            int j = i-1;
            
            while(j>=0 && currentno < arr[j])
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = currentno;

        }
        System.out.println("Insertion Sort Array :");
        for(int num : arr)
        {
            System.out.print(num+" ");//for each element in the arr array, assign its value to a new integer variable called num."
        }
         /* 
        you can also use this simple step to print array
        for (int i = 0; i < arr.length; i++) {
        System.out.print(" " + arr[i]);
        } 
        */
    }
}
