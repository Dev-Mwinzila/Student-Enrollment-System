import java.util.Scanner;

public class Student {
    private final String firstName;
    private final String lastName;
    private String studentID;
    private final int gradeYear;
    private String courses;
    public static int id = 1000;
    private int tuitionBalance;

    private static final int costOfCourse = 600;

    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student's First Name");
        this.firstName = in.nextLine();
        System.out.println("Enter student's Last Name");
        this.lastName = in.nextLine();
        System.out.println("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student's Class level:");
        this.gradeYear = in.nextInt();
        setStudentID();
        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
    }

    private void setStudentID() {
        id++;
        this.studentID = gradeYear + String.valueOf(id);
    }

    public void enroll() {
        String course;
        do {
            System.out.println("Enter course to enroll (Q to quit):");
            Scanner in = new Scanner(System.in);
            course = in.nextLine();
            if (!course.equalsIgnoreCase("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1!=1);

        System.out.println("Enrolled in: " + courses);
        System.out.println("Tuition Balance: " + tuitionBalance);

        // Process payment
        processPayment();
    }

    void processPayment() {
        // Here, you can integrate your payment API code to process the payment
        // You can make API requests, handle responses, and update the tuition balance accordingly
        // This is just a placeholder method for demonstration purposes
        System.out.println("Processing payment...");

        // Simulate a successful payment
        tuitionBalance = 0;
        System.out.println("Payment processed successfully.");
        System.out.println("Updated Tuition Balance: " + tuitionBalance);
    }
}
