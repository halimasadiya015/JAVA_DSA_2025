package Encapsulation;

import inheritance.main;

public class Encapsulationdemo {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("");
		s.setId(1);
		System.out.println("Name: "+ s.getName());
		System.out.println("id : "+ s.getId());
	}
}
