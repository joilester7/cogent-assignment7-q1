/**
 * 
 */
package com.cogent.assignments;

import java.util.Scanner;

/**
 * @author: Joi
 * @date: Jan 23, 2023
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		StudentTest st = new StudentTest();
		
		do {
			System.out.println("1 - Add students");
			System.out.println("2 - Print students");
			System.out.println("3 - Search name by entering a name");
			System.out.println("4 - Search name by entering an index");
			System.out.println("5 - Remove a name by entering a name");
			System.out.println("6 - Exit");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				st.setNames();
				break;
			case 2:
				System.out.println("List of students:");
				st.printNames();
				break;
			case 3:
				System.out.println("Please enter the student's name");
				st.searchName(sc.next());
				break;
			case 4:
				System.out.println("Please enter the index number");
				st.searchName(sc.nextInt());
				break;
			case 5:
				System.out.println("Please enter the student's name");
				st.removeName(sc.next());
				break;
			}
		} while(choice != 6);
		
	}
}
