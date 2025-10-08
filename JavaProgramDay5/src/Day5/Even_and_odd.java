package Day5;

import java.util.Scanner;

public class Even_and_odd {
	public static void main(String[] args) {
		Scanner sc= new
				Scanner(System.in);
		int even =0, odd =0;
		System.out.println("enter numbers(enter 0 to stop):");
		int num;
		do
		{
			num=sc.nextInt();
			if(num==0)break;
			if(num %2==0) {
				even++;
				
			}
			else {
				odd++;
				
			}
			
		}while(true);
		System.out.println("Even numbers:"+even);
		System.out.println("odd numbers:"+odd);
		sc.close();
	}
}
