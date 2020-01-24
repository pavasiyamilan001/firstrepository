/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software.design;

/**
 *
 * @author inspiron
 */
public class StudentList {
    public static void main(String[] args) {
        
        Student [] sList= new Student[5];
        
        for (int i=0;i<sList.length;i++)
        {
            sList[i]=new Student();
            sList[i].setName("Student" +(i+1));
        }
        
        for (int i=0;i<sList.length;i++)
        {
            System.out.println(sList[i].getName());
          
        }
        
    }
}
