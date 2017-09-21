package edu.wit.cs.comp1000;

/**
 * PA2a
 * @author Miles Macchiaroli
 *
 */
import java.util.Scanner; //Link Scanner Utility
public class PA2a { //Begin Class
	public static void main(String[] args) {//Begin Main String execution
		Scanner input = new Scanner(System.in); //Call for Scanner Utility
	//INIT VARS
		// Initialize User Inputs
		int in0;
		int in1;
		int in2;
		int in3;
		int in4;
		// Initialize Positive Trackers
		int pos0 = 0;
		int pos1 = 0;
		int pos2 = 0;
		int pos3 = 0;
		int pos4 = 0;
		// Initialize Non-Positive Trackers
		int neg0 = 0;
		int neg1 = 0;
		int neg2 = 0;
		int neg3 = 0;
		int neg4 = 0;
		// Initialize Calculatory Variables
		int totalSum;
		int posSum;
		int negSum;
		double posAvg;
		double negAvg;
		double totalAvg;
		//Initialize Tally System
		int posTally = 0;
		int negTally = 0;
		//Create a string for plurals 
		String posPlur="numbers";
		String negPlur="numbers";
	//REQUEST
		System.out.printf("Enter five whole numbers: ");
		in0 = input.nextInt(); // request value first input
		in1 = input.nextInt(); // request value second input
		in2 = input.nextInt(); // request value third input
		in3 = input.nextInt(); // request value fourth input
		in4 = input.nextInt(); // request value fifth input
	//END REQUEST
		
	//BEGIN GROUPING
	// IN0
		if (in0 > 0) {// if num0 is greater than 0
			posTally = posTally + 1;// increment posTally by 1
			pos0 = in0;// add num0 to pos0
		}
		else {
			negTally = negTally +1;
			neg0 = in0;
		}
	//IN1
		if (in1 > 0) {// if num1 is greater than 0
			posTally = posTally + 1;// increment posTally by 1
			pos1 = in1;// add num1 to pos1
		}
		else {
			negTally = negTally +1;// increment negTally by 1
			neg1 = in1;// move in1 to neg1
		}
	//IN2
		if (in2 > 0) {// if num2 is greater than 0
			posTally = posTally + 1;// increment posTally by 1
			pos2 = in2;// move num2 to pos2
		}
		else {
			negTally = negTally +1;// increment negTally by 1
			neg2 = in2;// move in2 to neg2
		}
	//IN3
		if (in3 > 0) {// if num3 is greater than 0
			posTally = posTally + 1;// increment posTally by 1
			pos3 = in3;// move num3 to pos3
		}
		else {
			negTally = negTally +1;// increment negTally by 1
			neg3 = in3;// move in3 to neg3
		}
	//IN4
		if (in4 > 0) {// if num4 is greater than 0
			posTally = posTally + 1;// increment posTally by 1
			pos4 = in4;// move num4 to pos4
		}
		else {
			negTally = negTally +1;// increment negTally by 1
			neg4 = in4;// move in4 to neg4
		}
	//END GROUPING
		
		//BEGIN CALCULATIONS
		totalSum = (in0 + in1 + in2 + in3 + in4);
		posSum = (pos0 + pos1 + pos2 + pos3 + pos4);
		negSum = (neg0 + neg1 + neg2 + neg3 + neg4);
		totalAvg = (totalSum / 5.0);
		//If pos = 0, skip division by 0
		if (posTally == 0){
			posAvg = 0;
		}
		else {
		posAvg = (1.0 * posSum / posTally);}
		//If neg = 0, skip division by 0
		if (negTally == 0){
			negAvg = 0;
		}
		else {
		negAvg = (1.0 * negSum / negTally);
		}
		//Ensure proper grammar
		if (posTally == 1) {
			posPlur = "number";
		}
		if (negTally == 1) {
			negPlur = "number";
		}
	//END CALCULATIONS
		
		
	//OUTPUT
		System.out.printf("The sum of the %d positive %s: %d%n", posTally, posPlur, posSum);
		System.out.printf("The sum of the %d non-positive %s: %d%n", negTally, negPlur, negSum);
		System.out.printf("The sum of the 5 numbers: %d%n", totalSum);
		System.out.printf("The average of the %d positive %s: %.2f%n", posTally, posPlur, posAvg);
		System.out.printf("The average of the %d non-positive %s: %.2f%n", negTally, negPlur, negAvg);
		System.out.printf("The average of the 5 numbers: %.2f%n", totalAvg);
	}
	//END OUTPUT

}