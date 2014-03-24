import java.io.*;
    public class hexadecimal_decimal
    {
    public static void main(String [] args)throws IOException
    {
    BufferedReader cd=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter a hexadecimal no.");
    String hex=cd.readLine();
    int ln =hex.length();
    char ar[]={'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E','F'};
    int deci=0;
    for(int i=ln-1; i>=0; i--)
    {
    char ch=hex.charAt(i);
    for(int j=0; j<36; j++)
    {
    if(ar[j]==ch)
    break;
    
    deci+=j*Math.pow(16,(ln-i-1));
    }
}
    System.out.println(deci);
    }
    }