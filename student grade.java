package student;

public class Result {

    public static void main(String[] args) {

        String[] students = {"Asha", "Ravi", "Kiran", "Neha", "Arjun"};
        int[] marks = {85, 72, 90, 64, 55};

        System.out.println("Name\tMarks\tGrade");
        System.out.println("----------------------");

        for (int i = 0; i < students.length; i++) {

            String grade;

            if (marks[i] >= 80)
                grade = "A";
            else if (marks[i] >= 60)
                grade = "B";
            else if (marks[i] >= 40)
                grade = "C";
            else
                grade = "Fail";

            System.out.println(students[i] + "\t" + marks[i] + "\t" + grade);
        }
    }
}
