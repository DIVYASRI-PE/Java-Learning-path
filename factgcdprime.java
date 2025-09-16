import java.util.Scanner;
class factgcdprime
{
public static void main(String args[])
Scanner sc=new Scanner(System.in);
System.out.print("Enter your choice:");
int c=sc.nextInt();
switch(c)
{
case 1:
int n=sc.nextInt();
System.out.println("Factorial:"+factorial(n));
break;
case 2:
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("GCD:"+gcd(a,b));
break;
case 3:
int n=sc.nextInt();
System.out.println("Factorial:"+factorial(n));
break;
