package strings;

public class Reverse_order_of_sentence {
	public static void main(String[] args) {
		String sentence = "Java is fun";
		String reversed = "";
		String[] words = sentence.split(" ");
		
		for (int i = words.length -1; i>=0; i--)
		{
			reversed += words[i] + " ";
		}
		System.out.println("Reversed string is :" +reversed);
	}
}
