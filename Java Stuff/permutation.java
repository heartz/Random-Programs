class permutation
{
public static void main(String[]args)
{
permuteString("","Fly");
}
static void permuteString(String bs,String es)
{
if(es.length()<=1)
System.out.println(bs+es);
else
{
for(int i=0;i<es.length();i++)
{
try
{String ns = es.substring(0,i) + es.substring(i+1);
permuteString(bs+es.charAt(i),ns);
}
catch(Exception e)
{}
}
}
}
}