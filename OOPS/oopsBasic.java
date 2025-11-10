package OOPS;

import java.util.Scanner;

class Student {
    String name;
    int roll_no;
    String section;
    float cgpa;
}

public class oopsBasic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Student s1 = new Student("prince", 139, "csaiml-c", 7.5f);
        // Student s2 = new Student("ojihuy", 165, "csaiml-c", 5.5f);

        // System.out.println(s1);
        // System.out.println(s2);

        // System.out.print("Enter new CGPA for " + s1.name + ": ");
        // if (sc.hasNextFloat()) {
        //     s1.cgpa = sc.nextFloat();
        // } else {
        //     sc.next(); // consume invalid input
        // }

        // System.out.println("Updated: " + s1);
        sc.close();
    }

}