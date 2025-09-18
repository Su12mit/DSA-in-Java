import java.io.*;
import java.util.*;
public class Numberpyramid
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
          // numbers
          for(int c=1; c<=r; c++)
          {
            System.out.print(c + " ");
          }
          System.out.println();
       }
        
        
    }
}