import java.io.*;
class fibonacci
{
static int fib(int n)
{
if(n<=1)
return(n);
else
return(fib(n-1)+fib(n-2));
}
public static void main(String[]args)throws IOException
{
int m=5;
System.out.println(fib(m));
}
}