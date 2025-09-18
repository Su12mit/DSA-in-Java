import java.io.*;
import java.util.*;
public class Butterflypattern
{
    public static void main(String args[])
    {
       int n = 5;
       // First Half -----------
            //upper half ----
    
        for(int r=1; r<=n; r++)
        {
            //1st Part ---
            for(int c=1; c<=r; c++)
            {
                System.out.print("*");
            }
            // spaces--
            int space =2*(n-r);
            for(int c=1; c<=space; c++)
            {
                System.out.print(" ");
            }

            // 2nd Part ----
             for(int c=1; c<=r; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Half ------------------

         for(int r=n; r>=1; r--)
        {
            //1st Part ---
            for(int c=1; c<=r; c++)
            {
                System.out.print("*");
            }
            // spaces--
            int space =2*(n-r);
            for(int c=1; c<=space; c++)
            {
                System.out.print(" ");
            }

            // 2nd Part ----
             for(int c=1; c<=r; c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
    }
}