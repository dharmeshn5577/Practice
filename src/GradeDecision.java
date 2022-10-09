import java.util.Scanner;

public class GradeDecision {


    public static void main(String[] args) {

        System.out.println("Enter your marks: ");
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();

        if (marks >= 100 || marks < 0){
            System.out.println("Invalid input. (Enter mark in the range 0 to 100 only)");
        }
        else if (marks >=70 && marks<=100){
            System.out.println("Garde: Distinction");
        } else if (marks>=60) {
            System.out.println("Grade: First Class");
        } else if (marks>=35) {
            System.out.println("Result: Pass");
            } else {
            System.out.println("Result: Fail");
        }

    }
}
