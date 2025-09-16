import java.util.Scanner;
class cgpa1
    {
    public static double calculateTotal(double[] grades) {
        double total = 0;
        for (double g : grades) 
        {
            total += g;
        }
        return total;
    }
    public static double calculateCGPA(double[] grades) {
        double total = calculateTotal(grades);
        return total / grades.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        double[] grades = new double[n];
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter grade point for subject " + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
        }
        double cgpa = calculateCGPA(grades);

        System.out.println("\nYour CGPA is: " + cgpa);
        double percentage = cgpa * 9.5;
        System.out.println("Equivalent Percentage: " + percentage + "%");
        sc.close();
    }
}
