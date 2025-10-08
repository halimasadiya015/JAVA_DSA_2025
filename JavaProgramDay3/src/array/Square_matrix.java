package array;

public class Square_matrix {
	public static void main(String[] args) {
		int[][]matrix ={
				{1,2,3,1},
				{4,5,6,2},
				{7,8,9,3},
				{2,1,3,4}
		        };
		
		int sum=0;
		
		for (int i = 0; i<matrix.length; i++)
		{
			sum=sum +matrix[i][i];
		}
		System.out.println("Sum of diagonal element i:" + sum);
				
	}
}
