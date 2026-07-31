/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bse5a2_l227998_laibanadeem_q2;
import java.util.ArrayList;

/**
 *
 * @author fast
 */
public class Course {
    public String courseName;
    public ArrayList<Student> std;
    
    public Course(String name){
        this.courseName=name;
        std= new ArrayList<>();
    }
    
    public void AddStudent(Student st){
    std.add(st);
    }
    
    public void RemoveStudent(String id){
        for (Student st : std) {
            if(st.id.equals(id)){
                std.remove(st);
            }
        }
    
    }
    
    void displayAllStudents(){
    
        for (Student st : std) {
            System.out.print("Name: "+st.name);
            System.out.print("Id: "+st.id);
        }
   
    }
    
    public Student findTopStudent(){
    int max_grade=0, index=-1;
    for(int i=0;i<std.size();i++){
        if(max_grade<std.get(i).calculateAverage()){
            max_grade=std.get(i).calculateAverage();
            index=i;
        }
    }
    return std.get(index);
    }
    
}
