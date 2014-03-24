import java.io.*;
class rotation
{
public static void main(String[]args)throws IOException
{
DataInputStream cd = new DataInputStream(System.in);
System.out.println("Accept a string");
String a = cd.readLine();
String ch2="";
int l =a.length();
for(int i=0;i<l;i++)
{
char ch = a.charAt(i);
ch2+=ch;
String s = a.substring(i+1,l);
String c = s.concat(ch2);
System.out.println(c);
a=c;
ch2="";
}
}
}