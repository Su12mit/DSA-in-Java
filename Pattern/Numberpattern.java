import java.io.*;
public class Numberpattern
{
    public static void main(String args[])
    {
        int r, c;
        int n=5;
       
        //outer loop
        for( r=1; r<=n; r++)
        {
           //inner loop
            for( c=1; c<r; c++)
            {         
                    System.out.print(c);      
            }
           
            System.out.println(r);
        }
    }
}