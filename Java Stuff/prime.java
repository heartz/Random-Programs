import java.io.*;
public class prime
{
public static boolean prime(int a)
{
int f=0;
for(int i=2;i<a;i++)
{
if(a%i==0)
{
f++;
}
}
if(f==0)
return true;
else
return false;
}
public static void main(String[]args)throws IOException
{
DataInputStream ab = new DataInputStream(System.in);
System.out.println("Enter");
int k=Integer.parseInt(ab.readLine());
for(int i=2;i<=k;i++)
{
boolean j = prime(i);
if((j==true)&&(k%i==0))
{
System.out.print(i+" ");
}
}

}
}