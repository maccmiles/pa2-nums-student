package edu.wit.cs.comp1000;

/**
 * PA2b
 * @author Miles Macchiaroli
 *
 */
import java.util.Scanner; //Link Scanner Utility
public class PA2b {//Begin Class
	/**
	 * This Program solves for Quadratic Equations
	 * @param args
	 */
	public static void main(String[] args) {//Begin Main String execution
		Scanner input = new Scanner(System.in); //Call for Scanner Utility
	//INIT VARS
		double a;
		double b;
		double c;
		double d;
		double sr;
		double r1;
		double r2;
	//REQUEST INPUT
		System.out.printf("Enter a b c: ");
		a = input.nextDouble(); // request value first input
		b = input.nextDouble(); // request value second input
		c = input.nextDouble(); // request value third input
	//Calculate discriminant
		d = Math.pow(b, 2) - 4*a*c;
	//Check val d
	if (d == 0) {//d equals 0 (one Root)
		sr = (-b) / 2 * a;
		System.out.printf("Root: %.2f%n", sr); // Print singular root
	}
	else if(d < 0){//d less than 0 (no roots)
		System.out.printf("Roots: imaginary%n"); // Print imaginary
	}else {//d > 0 (two Roots)	
	// Calculate multiple roots
	r1 = ((-b + Math.sqrt(d))/ (2*a));//Quadform for pos
	r2 = ((-b - Math.sqrt(d))/ (2*a));//Quadform for neg
//Output Quadform
	if (r1 < r2) {
	System.out.printf("Roots: %.2f, %.2f$n", r1, r2);//If r1 is less than r2
}
	else {
		System.out.printf("Roots: %.2f, %.2f%n", r2, r1);//if r2 is less than r1
	}}}}