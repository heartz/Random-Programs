import java.io.*;
class intersection
{
public static void main(String[]args)throws IOException
{
int ip;
DataInputStream cd = new DataInputStream(System.in);
System.out.println("Accept a string");
String a = cd.readLine();
int l = a.length();
do
{
System.out.println("Accept intersection point");
ip = Integer.parseInt(cd.readLine());
}while(ip>0||ip<l);
for(int i=0;i<l;i++)
{
if(i+1==ip)
System.out.println(a);
else
{
for(int j=1;j<ip;j++)
{
System.out.println("");
}
char ch = a.charAt(i);
System.out.print(ch);
}
System.out.println();
}
}
}