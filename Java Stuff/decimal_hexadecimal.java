import java.io.*;
    public class decimal_hexadecimal
    {
    public static void main(String [] args)throws IOException
    {
    BufferedReader cd=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter a decimal no.");
    int dec=Integer.parseInt(cd.readLine());
    char ar[]={'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E','F'};
    String s="";
    while(dec>16)
    {
    int mod=dec%16;
    s=s+ar[mod];
    dec=dec/16;
    }
    s=s+ar[dec];
    System.out.println("the hexadecimal no."+s);
    }
    }
    