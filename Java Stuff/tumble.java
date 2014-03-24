import java.io.*;
class tumble
{
public static void main(String[]args)throws Exception
{
DataInputStream ab = new DataInputStream(System.in);
System.out.println("Enter the sentence");
String a = ab.readLine();
int ln = a.length();
char ar[]= new char[ln];
char ar1[]= new char[ln];
int v=0,s=0;
for(int i=0;i<ln;i++)
{
ar[i]= a.charAt(i);
}
for(int i=0;i<ln;i++)
{
if((ar[i]=='A')||(ar[i]=='a')||(ar[i]=='E')||(ar[i]=='e')||(ar[i]=='I')||(ar[i]=='i')||(ar[i]=='O')||(ar[i]=='o')||(ar[i]=='u')||(ar[i]=='U'))
{
v=i;
break;
}
}
for(int i=0;i<ln;i++)
{
if(ar[i]==' ')
{
s=i;
}
}
for(int i=0;i<(ln-1);i++)
{
if(i!=v)
{
char temp =ar[i];
for(int j=0;j<(s-1);j++)
{
ar[i]=ar[i+1];
}
ar[s-1]=temp;
}
}
for(int i=0;i<ln;i++)
{
System.out.print(ar[i]);
}
}
}
