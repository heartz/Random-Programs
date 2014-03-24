import java.io.*;
class reverse
{
static void rev(int l,String s)
{
if(l>=0)
{
System.out.print(s.charAt(l));
l--;
rev(l,s);
}
}
public static void main(String[]args)throws IOException
{
DataInputStream cd = new DataInputStream(System.in);
System.out.println("Accept a string");
String a = cd.readLine();
int l = a.length();
rev(l-1,a);
}
}