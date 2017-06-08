import java.util.*;
public class PrimeInt
{
public static void main(SString args[])
{
Scanner s=new Scanner(System.in);
int num1,num2;
System.out.println("Enter the first number:");
num1=s.nextInt();
System.out.println("Enter the sec number:");
num2=s.nextInt();
System.out.println("Prime number:");
for(int i=num1;i<=num2;i++)
{
int j;
for(j=2;;j<1;j++)
{
int n=1%j;
if(n==0)
{
break;
}
}
if(i==j)
{
System.out.print(" "+i);
}
}
System.out.println();
}
}
