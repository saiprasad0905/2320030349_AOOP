package studentinformationportal;

public class StudentInformationSystem {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Sohail", "D435");
        Student student2 = new Student("Hitesh", "D436");
        Student student3 = new Student("Aditya", "D437");
        Student student4 = new Student("Sai Prasad", "D438");
        Student student5 = new Student("harsha", "D439");
        Student student6 = new Student("Priya", "D440");
        Student student7 = new Student("Karthikeya", "D441");
        Student student8 = new Student("Kailash", "D442");

        // Creating  courses 
        Course course1 = new Course("C001", "AOOP");
        Course course2 = new Course("C002", "AIML");
        Course course3 = new Course("C003", "Operating Systems");
        Course course4 = new Course("C004", "CTOOD");
        Course course5 = new Course("C005", "DS");
        Course course6 = new Course("C006", "CTSD");

        // Creating enrollment service
        EnrollmentService enrollmentService = new EnrollmentService();

        // Enrollment of  students in courses
        enrollmentService.enroll(student1, course1);
        enrollmentService.enroll(student1, course5);

        enrollmentService.enroll(student2, course1);
        enrollmentService.enroll(student2, course3);
        enrollmentService.enroll(student2, course6);

        enrollmentService.enroll(student3, course1);
        enrollmentService.enroll(student3, course4);
        enrollmentService.enroll(student3, course6);

        enrollmentService.enroll(student4, course2);
        enrollmentService.enroll(student4, course6);
        enrollmentService.enroll(student4, course5);

        enrollmentService.enroll(student5, course3);
        enrollmentService.enroll(student5, course6);

        enrollmentService.enroll(student6, course4);
        enrollmentService.enroll(student6, course6);

        enrollmentService.enroll(student7, course1);
        enrollmentService.enroll(student7, course3);
        enrollmentService.enroll(student7, course5);

        enrollmentService.enroll(student8, course2);
        enrollmentService.enroll(student8, course4);

        // Displaying enrolled students for each course
        printCourseEnrollments(course1);
        printCourseEnrollments(course2);
        printCourseEnrollments(course3);
        printCourseEnrollments(course4);
        printCourseEnrollments(course5);
        printCourseEnrollments(course6);
    }

    private static void printCourseEnrollments(Course course) {
        System.out.println("Students enrolled in " + course.getCourseName() + ":");
        for (Student student : course.getEnrolledStudents()) {
            System.out.println(student.getName());
        }
        System.out.println(); 
    }
}
