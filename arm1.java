import java.util.Scanner;
public class arm1 {
    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;       
            sum += digit * digit * digit; 
            num /= 10;                  
        }

        return sum == original; // true if Armstrong
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }

        sc.close();
    }
}
