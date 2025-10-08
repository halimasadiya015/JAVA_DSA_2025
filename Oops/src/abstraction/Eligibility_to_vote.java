package abstraction;

import java.util.Scanner;

public class Eligibility_to_vote {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter your age :");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println(age+"is eligible to vote");
		}
		else
			System.out.println(age+"is not eligible to vote");
	}
}
