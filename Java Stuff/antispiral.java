class antispiral
{
static void main(int n) 
{ 
int a[][]=new int[n][n];int c=n*n;
for (int i = n-1, j = 0; i > 0; i--, j++) 
{
for (int k = j; k < i; k++) a[j][k]=c--;
for (int k = j; k < i; k++) a[k][i]=c--;
for (int k = i; k > j; k--) a[i][k]=c--;
for (int k = i; k > j; k--) a[k][j]=c--;
} 
//special case for middle element if N is odd
if (n % 2 == 1)
a[(n-1)/2][(n-1)/2]=c--;
for(int i=0;i<n;i++){
for(int j=0;j<n;j++)
{if(a[i][j]<10)
System.out.print(" ");
System.out.print(a[i][j]+" ");}
System.out.println();}
}
}