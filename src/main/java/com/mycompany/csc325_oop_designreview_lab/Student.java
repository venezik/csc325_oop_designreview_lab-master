/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
	// ToDo 1: Make this class a child of Human
    double gpa;
	// ToDo 2: Fix the resulting errors
    public Student(String name, short age, String address, double gpa){
        super(name, age);
        this.setAddress(address);
        this.gpa = gpa;
    }
	// ToDo 3: Add a field for GPA and create a setter and a getter

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
          super.address = address;
    }

    // ToDo 4: Add comments to your code
}
