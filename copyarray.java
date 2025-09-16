import java.util.*;
class copyarray
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the element size:");
int a=sc.nextInt();

}
public static int copyarray(int size,Scanner sc)
{
int arr1[]=new int[size];
int arr2[]=new int[size];
System.out.println("Enter the element:");
for(int i=0;i<arr1.length;i++)
{
arr1[i]=sc.nextInt();
}
for(int i=0;i<arr2.length;i++)
{
arr2[i]=arr1[i];
}
copyarray(size,sc);
System.out.println(Arrays.toString(arr1));
System.out.println(Arrays.toString(arr2));
}
}
}
