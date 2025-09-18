import java.io.*;
public class Binarynumbers
{
    public static void main(String args[])
    {
        int r, c;
        int n=5;
        int sum = 0;
       
        //outer loop
        for( r=1; r<=n; r++)
        {
           //inner loop
            for( c=1; c<=r; c++)
            {       
                sum = r+c;
                if(sum % 2 == 0){
                    System.out.print(" 1");
                } else{
                    System.out.print(" 0");
                }
            }      
            System.out.println();
           
           
        }
    }
}