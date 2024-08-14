package a1;

import java.util.Scanner;

public class stud {
	int regno;
	String name,dept;
	Scanner s;
	
	void input() {
		s=new Scanner(System.in);
		System.out.println("Enter Regno.");
		regno=s.nextInt();
		System.out.println("Enter name");
		name=s.next();
		System.out.println("Enter Dept");
		dept=s.next();
	}
	void display() {
		System.out.println("Regno is: "+regno);
		System.out.println("Name is : "+name);
		System.out.println("Department is : "+dept);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stud a = new stud();
		a.input();
		a.display();
	}

}
