/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bse5a2_l227998_laibanadeem_q2;
import java.util.Scanner; 
/**
 *
 * @author fast
 */
public class BSE5A2_L227998_LaibaNadeem_Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Course OOP= new Course("Object Oriented Programming");
        //taking input for 1st student
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Enter student name: ");
        String std_name = myObj.nextLine();
        myObj = new Scanner(System.in);  
        System.out.println("Enter student id: ");
        String std_id = myObj.nextLine();
        Student st1= new Student(std_name, std_id);
        System.out.println("Enter student grades: ");
        myObj = new Scanner(System.in);  
        int grade1 = myObj.nextInt();
        st1.addGrade(grade1);
        myObj = new Scanner(System.in);  
        int grade2 = myObj.nextInt();
        st1.addGrade(grade2);
        myObj = new Scanner(System.in);  
        int grade3 = myObj.nextInt();
        st1.addGrade(grade3);
        myObj = new Scanner(System.in);  
        int grade4 = myObj.nextInt();
        st1.addGrade(grade4);
        myObj = new Scanner(System.in);  
        int grade5 = myObj.nextInt();
        st1.addGrade(grade5);
        st1.displayGrade();
        
         //taking input for 2nd student
         myObj = new Scanner(System.in);  
        System.out.println("Enter student name: ");
         std_name = myObj.nextLine();
        myObj = new Scanner(System.in);  
        System.out.println("Enter student id: ");
         std_id = myObj.nextLine();
        Student st2= new Student(std_name, std_id);
        System.out.println("Enter student grades: ");
        myObj = new Scanner(System.in);  
         grade1 = myObj.nextInt();
        st2.addGrade(grade1);
        myObj = new Scanner(System.in);  
         grade2 = myObj.nextInt();
        st2.addGrade(grade2);
        myObj = new Scanner(System.in);  
         grade3 = myObj.nextInt();
        st2.addGrade(grade3);
        myObj = new Scanner(System.in);  
         grade4 = myObj.nextInt();
        st2.addGrade(grade4);
        myObj = new Scanner(System.in);  
         grade5 = myObj.nextInt();
        st2.addGrade(grade5);
        st2.displayGrade();
        
         //taking input for 3rd student
         myObj = new Scanner(System.in);  
        System.out.println("Enter student name: ");
         std_name = myObj.nextLine();
        myObj = new Scanner(System.in);  
        System.out.println("Enter student id: ");
         std_id = myObj.nextLine();
        Student st3= new Student(std_name, std_id);
        System.out.println("Enter student grades: ");
        myObj = new Scanner(System.in);  
         grade1 = myObj.nextInt();
        st3.addGrade(grade1);
        myObj = new Scanner(System.in);  
         grade2 = myObj.nextInt();
        st3.addGrade(grade2);
        myObj = new Scanner(System.in);  
         grade3 = myObj.nextInt();
        st3.addGrade(grade3);
        myObj = new Scanner(System.in);  
         grade4 = myObj.nextInt();
        st3.addGrade(grade4);
        myObj = new Scanner(System.in);  
         grade5 = myObj.nextInt();
        st3.addGrade(grade5);
        st3.displayGrade();
        
        
    }
    
}
