import java.util.Scanner;
class calculator
{
public static int add(int a,int b)
{
return a+b;
}
public static int sub(int a,int b)
{
return a-b;
}
public static int mul(int a,int b)
{
return a*b;
}
public static int div(int a,int b)
{
return a/b;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your number:");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("1.Add");
System.out.println("2.Sub");
System.out.println("3.Multi");
System.out.println("4.Div");
System.out.println("Enter your choice:");
int ch=sc.nextInt();
switch(ch)
{
case 1:
{
System.out.println(add(a,b));
break;
}
case 2:
{
System.out.println(sub(a,b));
break;
}
case 3:
{
System.out.println(mul(a,b));
break;
}
case 4:
{
System.out.println(div(a,b));
break;
}
default:
{
System.out.println("Enter the correct choice");
}
}
}
}

