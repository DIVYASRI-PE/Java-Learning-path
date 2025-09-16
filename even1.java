import java.util.Scanner;
class even1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
boolean s=true;
while(n!=0)
{
int a=n%10;
if(a%2==1)
{
s=false;
break;
}
n/=10;
}
if(s)
{
System.out.println("Yes");
}
else
{
System.out.println("No");
}
}
}

