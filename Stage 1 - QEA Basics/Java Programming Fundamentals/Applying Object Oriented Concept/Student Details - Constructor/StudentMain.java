import java.util.*;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sid;
        String name, address, cname, choice;

        System.out.println("Enter Student's Id:");
        sid = sc.nextInt();
        System.out.println("Enter Student's Name:");
        name = sc.nextLine();
        System.out.println("Enter Student's address:");
        address = sc.nextLine();
        System.out.println("Whether the student is from NIT(Yes/No):");
        choice = sc.nextLine().toLowerCase();

        Student student;

        while ((choice != "yes") || (choice != "no")) {
            if (choice == "yes") {
                student = new Student(sid, name, address);
                System.out.println("Student id:" + student.getStudentId());
                System.out.println("Student name:" + student.getStudentName());
                System.out.println("Address:" + student.getStudentAddress());
                System.out.println("College name:" + student.getCollegeName());
            } else if (choice == "no") {
                System.out.println("Enter the college name:");
                cname = sc.nextLine();
                student = new Student(sid, name, address, cname);
                System.out.println("Student id:" + student.getStudentId());
                System.out.println("Student name:" + student.getStudentName());
                System.out.println("Address:" + student.getStudentAddress());
                System.out.println("College name:" + student.getCollegeName());
            } else {
                System.out.println("Whether the student is from NIT(Yes/No):");
                choice = sc.nextLine().toLowerCase();
            }
        }
        sc.close();
    }
}