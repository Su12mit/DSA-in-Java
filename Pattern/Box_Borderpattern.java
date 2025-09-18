import java.io.*;
public class Box_Borderpattern
{
    public static void main(String args[])
    {
        int r, c;
        int n=4;
        int  m=5;
        //outer loop
        for( r=1; r<=n; r++)
        {
           //inner loop
            for( c=1; c<m; c++)
            {
                if(r==1 || c==1 || r==n || c==m)
                {
                    System.out.print("*");
                }else{
                     System.out.print(" ");
                }
                
            }
            System.out.println("*");
        }
    }
}