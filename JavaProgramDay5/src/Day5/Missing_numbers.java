package Day5;

public class Missing_numbers {
	public static void main(String[] args) {
		int[]arr= {1,2,3,5,6};
		int n = 6;
		int sum = n*(n+1)/2;
		int arrSum = 0;
		
		for (int num:arr) {
			arrSum+=num;
		}
		System.out.println("Missing number : " + (sum-arrSum));
	}
}
