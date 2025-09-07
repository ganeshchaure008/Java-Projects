package TuesdayJava;

import java.util.Scanner;

public class OnlineCourseFeedback {
    public static void main(String[] args) {
        String studentName;
        String courseName;
        float rating;
        String feedback;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student Name:");
        studentName = scanner.nextLine();
        System.out.println("Course Name:");
        courseName = scanner.nextLine();
        System.out.println("Rating (out of 5):");
        rating = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Feedback:");
        feedback = scanner.nextLine();
        System.out.println("Thank you, " + studentName + "!");
        System.out.println("Course: " + courseName);
        System.out.println("Rating: " + rating + " out of 5");
        System.out.println("Feedback: " + feedback);
        scanner.close();

    }

}
