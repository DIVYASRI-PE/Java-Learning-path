import java.util.Scanner;
class traffic
{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
int traffic=sc.nextInt();
System.out.print("1.Domestic");
System.out.print("2.Commercial");
System.out.print("3.Industrial");
int choice=sc.nextInt();
System.out.print("Enter the units:");
int users=sc.nextInt();
int bill=0;
switch(choice)
{
case1:
{
bill=units*3;
break;
}
case2:
{
bill=units*5;
break;
}
case3:
{
bill=units*8;
break;
}
default:
System.out.println("Enter the correct*choice");
}
System.out.println("bill:"+bill");
}
}
