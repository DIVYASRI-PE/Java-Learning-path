import java.util.*;
calss arr7
{
public static void main(String args[])
{
int[]a=new int[50];
for(int i=1;i<a.length;i++)
{
a[i]=i;
}
System.out.println("Even");
for(int i=1;i<a.length;i++)
{
if(a[i]%2==0)
{
System.out.print(a[i]* " ");
}
}
System.out.println();
System.out.println("Odd");
for(int i=1;i<a.length;i++)
{
if(a[i]%2!=0)
System.out.println(a[i]+ " ");
}
}
