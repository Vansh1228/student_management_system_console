package mini_projects.StudentManagementSystem;

import java.util.Scanner;

public class StudentReg {
   static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        // input num of students to be added
        // Array of students to be added
        System.out.println("Enter number of Students");
        int studentsNum = in.nextInt();
        Student[] arrStudents = new Student[studentsNum];
        for(int i=0;i<studentsNum;i++){
            arrStudents[i] = new Student();
        }

        // prompt to enter name and year for each student --> to do via constructor
     //  Student Vansh = new Student();
       // Vansh.studentBalance(500);
      //  Vansh.studentStatus();
        System.out.println();
        System.out.println("-------------------------------\n---------------------------\n-------------------------------");
        System.out.println("Displaying Student Status");
        for(int j=0;j<studentsNum;j++){
            arrStudents[j].studentStatus();
          //  System.out.println(arrStudents[j].studentStatus());
        }
    }
}
