import java.util.Scanner;
class fab
{
public static void main (String args[])
{
int a=0;
int b=1;
int n=5;
for(int i=0;i<n;i++)
{
int c=a+b;
System.out.println(a+" ");
a=b;
b=c;
}
}
}