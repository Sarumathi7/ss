import java.util.*;
public class PrimeRange
{
public static void main(String args[])
{
int num=1,b,c,range;
Scanner s=new Scanner(System.in);
System.out.println("Enter the range\n");
range=s.nextInt();
while(num<=range)
{
b=1;
c=0;
while(b<=num)
{
if((num%b)==0)
c=c+1;
b++;
}
if(c==2)
Sustem.out.println(num);
num++;
}
}
}
