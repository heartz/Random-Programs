import java.io.*;
class rev
{
public static void main(String[]args)throws IOException
{
System.out.println("Enter main string");
DataInputStream cd = new DataInputStream(System.in);
String s = cd.readLine();
String s2="";
int l = s.length();
for(int i=(l-1);i>=0;i--)
{
char a = s.charAt(i);
s2=s2+a;
}
System.out.println("Reversed String:" +s2);
}
}
