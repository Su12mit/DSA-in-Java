import java.io.*;
public class Trianglepattern
{
    public static void main(String args[])
    {
        int r, c;
        int n=4;
       
        //outer loop
        for( r=1; r<=n; r++)
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