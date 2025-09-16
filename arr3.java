import java.util.*;
class arr3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int size=3;
int[]a=new int[size];
for(int i=0;i<size;i++)
{
a[i]=sc.nextInt();
}
for(int i:a)
{
System.out.println(i);
}
}
}
