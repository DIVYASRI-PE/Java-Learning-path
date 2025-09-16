import java.util.Scanner;
class area1
    {
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;  
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double area = calculateArea(radius);
        System.out.println("The area of the circle is: " + area);

        sc.close();
    }
}
