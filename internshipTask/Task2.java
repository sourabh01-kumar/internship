package javaInternship;

    import java.util.Scanner;

    public class StudentGradeCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get the student's name
            System.out.print("Enter student's name: ");
            String name = scanner.nextLine();

            // Get the student's subject
            System.out.print("Enter the total number of subject: ");
            int totalSub = scanner.nextInt();
            int sum = 0;
            int totalMark =0;

            // Get the student's marks
            for(int i=1;i<=totalSub;i++){
                System.out.println("Enter the the marks of subject no: "+i);
                int mark=scanner.nextInt();
                sum +=mark;
            }
            totalMark +=sum;
            double avgPercentage = (double) totalMark/totalSub;

            // Determine the grade
            char Grade;
            String message;
            if (avgPercentage >= 95) {
                message = "outstanding";
                Grade = 'O';
            }
            if (avgPercentage >= 90) {
                message ="Excellent";
                Grade = 'E';
            } else if (avgPercentage >= 80) {
                message = "very good";
                Grade = 'A';
            } else if (avgPercentage >= 70) {
                message = "good";
                Grade = 'B';
            } else if (avgPercentage>= 60) {
                message = "Average";
                Grade = 'C';
            } else {
                message= "fail";
                Grade = 'F';
            }

            // Display the result
            System.out.println("Student Name: " + name);
            System.out.println("Total Marks: " + avgPercentage);
            System.out.println("Remark: "+message);
            System.out.println("Grade: " + Grade);
        }
    }

