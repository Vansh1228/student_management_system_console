package mini_projects.StudentManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private ArrayList<String> coursesEnrolled;
    private double studentBalance;
    private double coursePrice;
    private int studentID;
    private double tuitionBalance;
    private int genericID  = 1000;
// student should have 5 digit unique ID with first num being grade level
    public Student(){
        System.out.println("Enter your First Name");
        this.firstName = sc.next();
        System.out.println("Enter your Last Name");
        this.lastName = sc.next();
        System.out.println("Enter your Grade Level Name");
        this.gradeLevel = sc.nextInt();
        studentID();
        // course enrollment function
       this.coursesEnrolled=CoursesEnrolled();
        System.out.println("You have enrolled into following courses: "+this.coursesEnrolled+"\nYour total applicable Tuition fees is $"+this.coursePrice);
        System.out.println("Please enter the amount for the payment");
        int amt = sc.nextInt();
        studentBalance(amt);

       // studentStatus();
    }
    int studentID(){
        genericID++;
        this.studentID=  gradeLevel*10000+genericID;
        return this.studentID;
    }

    /* student can enroll in following courses :
    History  101
    Mathematics  101
    English 101
    Chemistry 101
     Computer Science 101
     */

    ArrayList<String> CoursesEnrolled(){
        ArrayList<String> list = new ArrayList<>(5);
        System.out.println("The cost for each course is 600$. How many courses you want to enroll in?");
        int numCourse = sc.nextInt();
        if(numCourse>5 && numCourse<1)
            System.out.println("Please enter a valid number");
        else {
            int count = numCourse;
            while (count != 0) {
                System.out.println("Select following courses to enroll from:\nPress 1 for History 101\nPress 2 for Mathematics 101\nPress 3 for English 101" +
                        "\nPress 4 for Chemistry 101 \nPress 5 for Computer Science 101");
                int press = sc.nextInt();
                switch (press) {
                    case 1 -> list.add("History 101");
                    case 2 -> list.add("Mathematics 101");
                    case 3 -> list.add("English 101");
                    case 4 -> list.add("Chemistry 101");
                    case 5 -> list.add("Computer Science 101");
                }
                count--;
                coursePrice+=600;
            }
        }
        return list;
    }

    // Each course costs 600$ to enroll
    void studentBalance(double payment){ // to be called in the main
        this.tuitionBalance = coursePrice-payment;
        System.out.println();
        System.out.println("Thanks for enrolling into the course... Your remaining tuition balance to be paid is "+this.tuitionBalance);
    }
    // Student should be able to view their balance and pay tuition
   // To see status() of the students,  we should be able to see name, id, courses enrolled, balance
   public void studentStatus(){
        System.out.println("Student Information\n Name: "+this.firstName+" "+ this.lastName+"\n Student ID: "+this.studentID+"\n Course Enrolled: "
                +this.coursesEnrolled+"\n Student Balance to be paid: "+ this.tuitionBalance);

    }
}
