import java.io.*;
import java.util.*;
public class Diamondpattern
{
    public static void main(String args[])
    {

       int n = 4;
       //upper Part
       for(int r=1; r<=n; r++)
       {
         //spaces
         for(int c=1; c<=n-r; c++)
         {
            System.out.print(" ");
         }
          int uno=2*r-1;
          for(int c=1; c<=uno; c++)
          {
            System.out.print("*");
          }
          System.out.println();
           
       }

       //Lower part
       for(int r=n; r>=1; r--)
       {
         //spaces
         for(int c=1; c<=n-r; c++)
         {
            System.out.print(" ");
         }
          int uno=2*r-1;
          for(int c=1; c<=uno; c++)
          {
            System.out.print("*");
          }
          System.out.println();
           
       }
        
        
    }
}