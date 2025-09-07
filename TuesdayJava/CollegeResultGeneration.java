package TuesdayJava;

import java.util.Scanner;

public class CollegeResultGeneration {
    public static void main(String[] args) {
        int subject1;
        int subject2;
        int subject3;
        int total;
        float average;
        String result;
        Scanner student = new Scanner(System.in);
        System.out.println("marks of subject 1:");
        subject1 = student.nextInt();
        System.out.println("marks of subject 2:");
        subject2 = student.nextInt();
        System.out.println("marks of student 3:");
        subject3 = student.nextInt();
        total = subject1 + subject2 + subject3;
        average = total / 3.0f;
        result = (average > 35) ? "Pass" : "Fail";
        System.out.println("Subject 1:" + subject1);
        System.out.println("Subject 2:" + subject2);
        System.out.println("Subject 3:" + subject3);
        System.out.println("Total:" + total);
        System.out.println("Average:" + average);
        System.out.println("Result:" + result);
        student.close();

    }

}
