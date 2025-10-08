package array;

public class Second_largest {
	public static void main(String[] args) {
		int[]arr= {30,5,8,20};
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int num : arr) {
			if (num>largest) {
				secondLargest=largest;
				largest=num;
			}
			else if(num>secondLargest && num!=0)
			{
				secondLargest = num;
			}
		}
	     System.out.println("SecondLargest: "+secondLargest);
	}
}
