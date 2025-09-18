import java.io.*;
public class Triangle_upside
{
    public static void main(String args[])
    {
        int r, c;
        int n=4;
       
        //outer loop
        for( r=n; r>=1; r--)
        {
           //inner loop
            for( c=1; c<r; c++)
            {
              
                    System.out.print("*");
               
                
            }
            System.out.println("*");
        }
    }
}