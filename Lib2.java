import java.util.Scanner;
class Lib2
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of days late: ");
int daysLate = sc.nextInt();
int fine = 0;
boolean suspended = false;
if (daysLate <= 0) 
{
System.out.println("Book returned on time. No fine.");
} 
else if (daysLate <= 5) 
{
fine = daysLate * 2;
} 
else if (daysLate <= 6&& daysLate<=10) 
{
fine = daysLate * 4;
} 
else if (daysLate <= 11&& daysLate<=13) 
{
fine = daysLate * 8;
System.out.println("Membership Suspended!");
}
}
}