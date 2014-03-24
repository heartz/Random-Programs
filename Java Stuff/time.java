import java.io.*;
    public class time
    {
    public static void main(String [] args)throws IOException
    {
    BufferedReader cd=new BufferedReader(new InputStreamReader(System.in));
    String hr[]={"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve"};
    String min[]={"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine", "thirty"};
    System.out.println("enter time");
    String tym=cd.readLine();
    String x=tym.substring(0,tym.indexOf(':'));
    String y=tym.substring(tym.indexOf(':')+1);
    int a=Integer.parseInt(x);
    int b=Integer.parseInt(y);
    if(b==0)
    System.out.println(hr[a]+" o'clock");
    if(b>0&&b<=30)
    {
    if(b==15)
    System.out.println(" quarter past "+hr[a]);
    else if(b==30)
    System.out.println(" half past "+hr[a]);
    else
    System.out.println(min[b]+" minutes past "+hr[a]);
    }
    if(b>30&&b<=59)
    {
    int c=60-b;
    if(c==15)
    System.out.println(" quarter to "+hr[a+1]);
    else
    System.out.println(min[c]+" minutes to "+hr[a+1]);
    }
    }
    }