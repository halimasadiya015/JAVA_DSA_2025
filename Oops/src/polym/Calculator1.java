package polym;

class Calculator
{
 int add(int a,int b) {
	 return a+b;
 }
 int add(int a, int b, int c, int d) {
	 return a+b+c+d;
 }
 double add (double a , double b){
	 return a+b;
 }
}
public class Calculator1 {
	 public static void main(String[]args) {
		 Calculator calc = new Calculator();
		 System.out.println("sum of two inputs:"+calc.add(5,10));
		 System.out.println("sum of four inputs:"+calc.add(5,10,15,20));
		 System.out.println("sum of two doubles inputs:"+calc.add(5.5,2));
		 
	 }
	 
	 
 }



