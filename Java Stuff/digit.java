import java.io.*;
class digit
{
static int digits(int a)
{
if(a==0)
return 0;
return(1+digits(a/10));
}
public static void main(String[]args)throws IOException
{
DataInputStream cd =new DataInputStream(System.in);
System.out.println("Accept a no.");
int n = Integer.parseInt(cd.readLine());
int meh =digits(n);
System.out.println("No. of digits"+meh);
}
}