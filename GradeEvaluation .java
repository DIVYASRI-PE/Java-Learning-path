import java.util.Scanner;

public class GradeEvaluation {

    public static String calculateGrade(int score) {
        if(score >= 90) {
            return "A";
        } else if(score >= 80) {
            return "B";
        } else if(score >= 70) {
            return "C";
        } else if(score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void displayGrade(int score, String grade) {
        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's score: ");
        int score = sc.nextInt();

        String grade = calculateGrade(score);
        displayGrade(score, grade);

        sc.close();
    }
}