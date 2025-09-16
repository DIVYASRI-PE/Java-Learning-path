import java.util.*;
class arr6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]={5,10,15,20,25};
int key=sc.nextInt();
int c=0;
for(int i=0;i<a.length;i++)
{
if(a[i]==key)
{
c++;
System.out.println("Found at index:"+i);
}
}
if(c>0)
{
System.out.println("Element found+c+times");
}
else
{
System.out.println("Element not found");
}
}
}