import java.io.*;
import java.util.*;
public class Palindronicpattern
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
          //1st half numbers
          for(int c=r; c>=1; c--)
          {
            System.out.print(c);
          }
           // 2nd Half numbers
           for(int c=2; c<=r; c++)
           {
            System.out.print(c);
           }
          System.out.println();
       }
        
        
    }
}