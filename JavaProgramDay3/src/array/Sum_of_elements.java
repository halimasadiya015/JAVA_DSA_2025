package array;

public class Sum_of_elements {
	public static void main(String[] args) {
		int [][] arr = {
				       {1,2,3},
				       {4,5,6},
				       {9,8,7}
				       };
		for (int i =0; i<arr.length; i++)
		{
			int sum=0;
			for (int j=0; j< arr[i].length; j++)
			{
			    sum+=arr[i][j];
			}
				System.out.println("row" + (i+1) + "sum=" +sum);
			
		}
	}
	
}
