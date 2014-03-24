import java.io.*;
public class special
{
public static void main(String[]args)throws IOException
{
BufferedReader cd = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Character");
char a= (cd.readLine()).charAt(0);
System.out.println("Enter a number");
int m=Integer.parseInt(cd.readLine());
int b=m;
for(int i=1;i<=b+1;i++)
{
for(int j=1;j<=m;j++)
System.out.print(" ");
for(int k=1;k<=i;k++)
System.out.print(a+" ");
System.out.println();
m=m-1;
}
m=2;
for(int i=b-1;i>=1;i--)
{
for(int j=1;j<=m;j++)
System.out.print(" ");
for(int k=1;k<=i;k++)
System.out.print(a+" ");
System.out.println();
m=m+1;
}
}
}