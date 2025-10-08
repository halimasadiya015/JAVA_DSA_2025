package Encapsulation;

import java.util.Scanner;

import inheritance.main;
                                                                                                                                                          
public class Positive_or_negative {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number :");
		int num=sc.nextInt();
		if(num>0) {
			System.out.println(num+"is a positive number");
		}
		else
			System.out.println(num+"is a negative number");
	}
}
