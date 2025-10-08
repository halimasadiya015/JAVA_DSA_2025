package search;

public class Linearsearch {
	
	public static int Linearsearch (int [] arr, int key)
	{
		for (int i=0; i < arr.length; i++)
		{ 
			if (key ==arr[i])
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {2,4,6,8,10,12,14,16};
		int key = 10;
		 
		int index = Linearsearch(arr , key);
		
		if(index == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at :" + index);
	}
}
