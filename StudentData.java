import java.util.Scanner;
public class StudentData {
    static void displayAll(String names[], int marks[]) {
        System.out.println("\n--- All Students and Marks ---");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " : " + marks[i]);
        }
    }
    static void highestMarks(String names[], int marks[]) {
        int max = marks[0];
        int index = 0;

        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
                index = i;
            }
        }
        System.out.println("\nStudent with Highest Marks:");
        System.out.println(names[index] + " : " + max);
    }
    static void averageMarks(int marks[]) {
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        double avg = sum / (double) marks.length;

        System.out.println("\nAverage Marks: " + avg);
    }
    static void startingWithS(String names[]) {
        System.out.println("\nNames starting with letter 's':");
        for (String name : names) {
            if (name.toLowerCase().startsWith("s")) {
                System.out.println(name);
            }
        }
    }}

