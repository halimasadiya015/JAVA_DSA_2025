package javaprogramday2.firstprogram;

public class Armstrong_number {
	public static void main(String[] args) {
		int num=145;
		int original = num;
		int sum=0;

		while(num>0)
			{
			int digit = num%10;
			sum = sum + (digit*digit*digit);
			num=num/10;
			}
		if (sum == original)
		{
			System.out.println("It is a Armstong number");
		}
		else
		{
			System.out.println("It is not a armstrong number");
		}
			}

}
