
import java.util.Scanner;

public class BubbleSort{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("***BUBBLE SORT***");

        //Accept array Size from user
        System.out.println("Enter number of elements You Want: ");
        int n = sc.nextInt();

        //Create Array of Accepted Size
        int arr[]=new int[n];
        //Accept the array values
        System.err.println("Enter the Values :");
         for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //Bubble Sort

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){

                //Swapping
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    //time complexity 0(n^2) not good
                }
            }
        }

        //printing sorted array

        System.out.println("Sorted Array result");
        for(int num:arr){
        System.out.println(num+" ");
        }
    }
}