import java.io.*;
public class coder
{
public static void main(String[]args)throws Exception
{
DataInputStream cd = new DataInputStream(System.in);
System.out.println("Enter the code");
String s1 = cd.readLine();
String ss="";
int j=0;
String res;
int len = s1.length();
char ar2[] = new char[len];
for(int i=len;i>0;i--)
{
char ii = s1.charAt(i-1);
ss=ss+ii;
}
int ab = Integer.parseInt(ss);
String ar[]= new String [len];
for(int i=0;i<len-1;i++)
{
String c ="";
char cc = ss.charAt(i);
 c = c+cc;
ar[i]= c;
}
for(int i=0;i<len-2;i++)
{
String z = ar[i]+ar[i+1];
System.out.println(z);
int y = Integer.parseInt(z);
if((y>=65 && y<=90)||(y>=97 && y <=99)||(y==32))
{
char x = (char)y;
System.out.println(x);
ar2[j++]= x;
}
else if(i<(len-3))
{
String z2 = z+ar[i+2];
System.out.println(z2);
int y2 = Integer.parseInt(z2);
if((y>=100 && y<=122))
{
char x2 = (char)y2;
System.out.println(x2);
ar2[j++]=x2;
}
}
for(int k=0;k<j;k++)
{
System.out.print(ar2[k]);
}
}
}
}