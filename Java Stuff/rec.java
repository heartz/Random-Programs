import java.io.*;
class rec
{
static void bin(int n)
{
if(n>=1)
{
bin(n/2);
}
System.out.print(n%2);
}
public static void main(String[]args)throws IOException
{
DataInputStream cd = new DataInputStream(System.in);
System.out.println("Accept Decimal no.");
int n = Integer.parseInt(cd.readLine());
bin(n);
}
}