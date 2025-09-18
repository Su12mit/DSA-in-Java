import java.io.*;
public class Number_series
{
    public static void main(String args[])
    {
        int r, c;
        int n=5;
        int no = 1;
       
        //outer loop
        for( r=1; r<=n; r++)
        {
           //inner loop
            for( c=1; c<=r; c++)
            {         
                    System.out.print(" "+ no);  
                    no++;    
            }
            System.out.println();
           
           
        }
    }
}