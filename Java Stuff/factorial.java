import java.io.*;
class factorial
{
static int fact(int n)
{
if(n>1)
 {return(n*fact(n-1));
}
else
{
return(n);
}
}
public static void main(String[]args)throws IOException
{
DataInputStream cd = new DataInputStream(System.in);
System.out.println("Accept a no.");
int a = Integer.parseInt(cd.readLine());
int d = fact(a);
System.out.println(d);
}
}
