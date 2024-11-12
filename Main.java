import CIE.Internals;
import SEE.External;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();

        Internals[] internalStudents = new Internals[n];
        External[] externalStudents = new External[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("\nEnter details for Student " + (i + 1) + ":");

            System.out.print("USN: ");
            String usn = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Semester: ");
            int sem = sc.nextInt();

            int[] internalMarks = new int[5];
            int[] seeMarks = new int[5];
            System.out.println("Enter marks for 5 courses (Internal followed by SEE):");
            for (int j = 0; j < 5; j++) {
                System.out.print("Course " + (j + 1) + " Internal Marks: ");
                internalMarks[j] = sc.nextInt();
                System.out.print("Course " + (j + 1) + " SEE Marks: ");
                seeMarks[j] = sc.nextInt();
            }

            internalStudents[i] = new Internals(usn, name, sem, internalMarks);
            externalStudents[i] = new External(usn, name, sem, seeMarks);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("\nFinal Marks for Student " + (i + 1) + ":");
            internalStudents[i].displayStudentInfo();

            System.out.println("Course-wise Marks (Internal + SEE): ");
            for (int j = 0; j < 5; j++) {
                int finalMarks = internalStudents[i].internalMarks[j] + externalStudents[i].seeMarks[j];
                System.out.println("Course " + (j + 1) + ": " + finalMarks);
            }
        }

        sc.close();
    }
}
