package javaprogramday2.firstprogram;

public class Count_the_numbers {
	public static void main(String[] args) {
		int num = 98450;
		int count = 0;
		
		while(num > 0)
		{
			num = num/10;
			count++;
			}
		System.out.println("The number of digits are:"+count);
		}
}
