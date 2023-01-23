/**
 * 
 */
package com.cogent.assignments;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author: Joi
 * @date: Jan 23, 2023
 */
public class StudentTest {
	ArrayList<Student> names = new ArrayList();
	Scanner sc = new Scanner(System.in);
	
	public void setNames() {
		System.out.println("How many names do you want to create?");
		int size = sc.nextInt();
		for(int i = 0; i < size; i++) {
			System.out.println("Please enter student roll number");
			int rollNum = sc.nextInt();
			System.out.println("Please enter student name");
			String name = sc.next();
			System.out.println("Please enter student age");
			int age = sc.nextInt();
			System.out.println("Please enter student address");
			String address = sc.next();
			
			Student s1 = new Student(rollNum, name, age, address);
			names.add(s1);
		}
	}
	
	public void searchName(String name) {
		for(int i = 0; i < names.size(); i++) {
			if(names.get(i).getName().equals(name)) {
				System.out.println("This name exists in the list at index: " + names.indexOf(names.get(i)));
				
			}
		}
	}
	
	public void searchName(int index) {
		for(int i = 0; i < names.size(); i++) {
			if(names.indexOf(names.get(i)) == index) {
				System.out.println("This student exist, this name is " + names.get(index).getName());
			}
		}
	}
	
	public void printNames() {
		for(Student student : names) {
			System.out.println("Student roll number is: " + student.getRollNo());
			System.out.println("Student name is: " + student.getName());
			System.out.println("Student age is: " + student.getAge());
			System.out.println("Student address is: " + student.getAddress());
			System.out.println();
		}
		
//		System.out.println("List of names:");
//		for(int i = 0; i < names.size(); i++) {
//			System.out.println(names.get(i));
//		}
	}
	
	public void removeName(String stuName) {
		for(int i = 0; i < names.size(); i++) {
			if(names.get(i).getName().equals(stuName)) {
				names.remove(i);
				System.out.println("This name is removed, this is the new list:");
				printNames();
				
			}
		}
	}
}
