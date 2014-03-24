import java.util.*;
class sphenic
{
public boolean isprime(int a)
{int flag =0;
for(int i=2;i<a;i++)
{
if(a%i==0)
flag++;
}
if(flag>0)
return false;
else
return true;
}
public void main(String[]args)
{
Scanner br= new Scanner(System.in);
System.out.print("Enter Starting limit : ");
int f=br.nextInt();
System.out.print("Enter ending limit: ");
int l = br.nextInt();
int count =0;
sphenic obj = new sphenic();
for(int i=l;i<=count;i++)
{
if(obj.issphenic(i)==true)
System.out.println(i);
}
}
public boolean issphenic(int a)
{
sphenic obj = new sphenic();
int prod=1;
int count =0;
for(int i=1;i<a;i++)
{
if(obj.isprime(i)==true && (a%i==0))
{
prod*=i;
count++;
}
}
if(count==3 && prod==a)
return true;
else
return false;
}
}