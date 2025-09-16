import java.util.Scanner;
class Duck
{
public static boolean isDuck(int a)
{
while(a!=0)
{
int digit=a%10;
if(digit==0)
{
return true;
}
a/=10;
}
return false;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if(isDuck(a))
{
System.out.println(a +"it is Duck numbber");
}
else
{
System.out.println(a +"it is not Duck number");
}
}
}