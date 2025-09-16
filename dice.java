import java.util.Random;
import java.util.Scanner;
public class dice 
{
    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter number of times to roll the dice: ");
        int n = sc.nextInt();
        int[] count = new int[7]; 
        for (int i = 0; i < n; i++) 
        {
            int roll = rand.nextInt(6) + 1; 
            count[roll]++;
        }
        System.out.println("\nResults after " + n + " rolls:");
        for (int i = 1; i <= 6; i++) 
        {
            System.out.println(i + " appeared " + count[i] + " times");
        }
        sc.close();
}
}