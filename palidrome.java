import java.util.Scanner;
class palidrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no:");
int num=sc.nextInt();
int original=num;
int reverse=0;
while(num!=0)
{
int digit=num%10;
reverse=reverse*10+digit;
num/=10;
}
if(original==reverse)
{
System.out.println("It is palidrome");
}
else
{
System.out.println("It is not palidrome");
}
}
}