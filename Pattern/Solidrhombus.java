import java.io.*;
import java.util.*;
public class Solidrhombus
{
    public static void main(String args[])
    {
       int n = 5;
       for(int r=1; r<=n; r++)
       {
         //spaces
         for(int c=1; c<=n-r; c++)
         {
            System.out.print(" ");
         }
          // stars
          for(int c=1; c<=5; c++)
          {
            System.out.print("*");
          }
          System.out.println();
       }
        
        
    }
}