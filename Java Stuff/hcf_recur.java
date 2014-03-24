import java.io.*;
class hcf_recur
{
static int hcf(int a,int b)
{
if(b==0)
{
return a;
}
return hcf(b,a%b);
}
public static void main(String[]args)throws IOException
{
DataInputStream cd = new DataInputStream(System.in);
System.out.println("Accept two no.'s");
int n = Integer.parseInt(cd.readLine());
int n1 = Integer.parseInt(cd.readLine());
System.out.println(hcf(n,n1));
}
}
