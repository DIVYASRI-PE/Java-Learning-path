import java.util.Scanner;
class vowels
{
public static void vowel(int n,Scanner sc)
{
int count=0;
for(int i=1;i<=n;i++)
{
char ch=sc.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
{
count++;
}
}
System.out.print(count);
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
vowel(n,sc);
}
}




