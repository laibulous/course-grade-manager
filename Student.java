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
public class Student extends Person{
   public ArrayList<Integer> grades;
    
    public Student(String name, String id){
    this.name=name;
    this.id=id;
    grades= new ArrayList<>();
    }
    
    public void addGrade(int grade){
    grades.add(grade);
    }
    
    public int calculateAverage(){
        int sum=0;
        for(int i=0;i<grades.size();i++){
        sum+=grades.get(i);
        }
        return (sum / (grades.size()-1));
    }
    
    public void displayGrade(){
        System.out.print("\nName: "+this.name);
        System.out.print("\nId: "+this.id);
        System.out.print("\nGrades: \n");
        for(int i=0;i<grades.size();i++){
            System.out.print(grades.get(i)); 
            System.out.print("\n");
        }
    
    }
    
    public boolean hasPassed(){
        return this.calculateAverage()>60;
    }
    
    public int findHighestGrade(){
    int max=0;
    for(int i=0;i<grades.size();i++){
        if(max<grades.get(i)){
            max=grades.get(i);
        }
    }
    return max;
    
    }
    public int findLowestGrade(){
    int min=1000000;
    for(int i=0;i<grades.size();i++){
        if(min>grades.get(i)){
            min=grades.get(i);
        }
    }
    return min;
    }
}
