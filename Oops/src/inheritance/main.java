package inheritance; 

class Animal {
	 void eat() {
		 System.out.println("eating");
	 }
}

class dog extends Animal {
	public void bark()
	{
		System.out.println("Barking...");
	}
}

 public class main {
	public static void main(String[]args) {
		dog d = new dog();
		d.eat();
		d.bark();
	}
}