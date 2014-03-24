import java.io.*;
class backspiral
{
public static void main(String[]args)throws Exception
{ 
DataInputStream cd = new DataInputStream(System.in);
System.out.println("Enter limit");
int n = Integer.parseInt(cd.readLine());
int a[][]=new int[n][n];int c=1;
for (int i = n-1, j = 0; i > 0; i--, j++) 
{
for (int k = j; k < i; k++) a[j][k]=c++;
for (int k = j; k < i; k++) a[k][i]=c++;
for (int k = i; k > j; k--) a[i][k]=c++;
for (int k = i; k > j; k--) a[k][j]=c++;
} 
//special case for middle element if N is odd
if (n % 2 == 1)
a[(n-1)/2][(n-1)/2]=c++;
for(int i=0;i<n;i++){
for(int j=0;j<n;j++)
{if(a[i][j]<10)
System.out.print(" ");
System.out.print(a[i][j]+" ");}
System.out.println();
} 
for (int i = n-1, j = 0; i > 0; i--, j++) 
{
for (int k = j; k < i; k++) System.out.print(a[j][k]+" ");
for (int k = j; k < i; k++) System.out.print(a[k][i]+" ");
for (int k = i; k > j; k--) System.out.print(a[i][k]+" ");
for (int k = i; k > j; k--) System.out.print(a[k][j]+" ");
} 
//special case for middle element if N is odd
if (n % 2 == 1)
System.out.print(a[(n-1)/2][(n-1)/2]);
}

}