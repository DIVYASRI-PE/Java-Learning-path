import java.util.Scanner;
class weight
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the weight:");
int w=sc.nextInt();
System.out.println("Enter the target:");
int t=sc.nextInt();
System.out.println("Enter the loss:");
int l=sc.nextInt();
int irr=1;
int w =0;
while(w!=t)
{
w=w-l+irr;
w++;
}
if(w<100)
{
System.out.println("Total week:"+w);
}
else if(w>100)
{
System.out.println("+w");
}
}
}
