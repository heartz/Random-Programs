import java.io.*;
public class ddtranspose
{
public static void main(String[]args)throws IOException
{
BufferedReader cd = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Row and Column");
int r=Integer.parseInt(cd.readLine());
int c=Integer.parseInt(cd.readLine());
int m[][]=new int[r][c];
int n[][]=new int[r][c];
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
m[i][j]=Integer.parseInt(cd.readLine());
}
}
System.out.println("The numbers of Matrix are");
System.out.println("Enter Elements of array");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(m[i][j]);
}
System.out.println();
}
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
n[i][j]=m[j][i];
}
}
System.out.println("The transpose the matrix is");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(n[i][j]);
}
System.out.println();
}
}
}