package week3;

public class methods {

	static String catNumTimes(String word, int n) {
		String output = word;
		if(n > 1)
			for(int x = 2; x <= n; x++) {
				output += word;
			}
		return output;
	}

	static void catFirstLast(String first, String last) {
		System.out.println(first + " " + last);
	}
	
	static void testOver100(int[] input) {
		
		int sum = 0;
		for(int x = 0; x < input.length; x++) {
		sum = sum + input[x];
		}
	System.out.println(sum > 100);
	}
	static double returnAverage(double[] input) {
		
		double tot = 0;
		for(int x = 0; x < input.length; x++) {
			tot = tot + input[x];
		}
		return(tot/input.length);
	}
	static void averageTest(double[] array1, double[] array2) {
		System.out.println(returnAverage(array1) > returnAverage(array2));
	}
	
	static void willBuyDrink(boolean hotYesNo, double money) {
		System.out.println((hotYesNo && money > 10.50));
	}
	
	static void commentsPercent(double code, double comments) {
		System.out.println("You have spent " + comments/code*100 + "% lines on commenting your code");
	}
	public static void main(String[] args) {
//Write a method that takes a String, word, and an int, n, as arguments and returns the word 
//concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I would expect 
//the method to return “HelloHelloHello”).	
		System.out.println(catNumTimes("Hello" , 3));
		
//Write a method that takes two Strings, firstName and lastName, and returns a full name 
//(the full name should be the first and the last name as a String separated by a space).
		catFirstLast("Michael","Franzen");
		
//Write a method that takes an array of int and returns true if the sum of all the ints in 
//the array is greater than 100.
		int[] myArray = { 50, 10, 41 };
		testOver100(myArray);
		
//Write a method that takes an array of double and returns the average of all the elements 
//in the array.
		double[] myDoubleArray = { 21.1, 21.1, 21.2 };
		returnAverage(myDoubleArray);
		
//Write a method that takes two arrays of double and returns true if the average of the
//elements in the first array is greater than the average of the elements in the second array.
		double[] myDoubleArray2 = {25.2, 22.2, 22.2};
		double[] myDoubleArray3 = {22.3, 22.3, 22.3};
		averageTest(myDoubleArray2, myDoubleArray3);
		
//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double 
//moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater 
//than 10.50.
		boolean isHotOutside = true;
		double moneyInPocket = 10.51;
		willBuyDrink(isHotOutside, moneyInPocket);
		
		
//Create a method of your own that solves a problem. In comments, write what the method 
//does and why you created it.
//commentsPercent will return the percent of this class that was comments
//So I know how painless or painful it was to document my code
		int linesOfCode = 81;
		int linesOfComments = 16;
		commentsPercent(linesOfCode,linesOfComments);
	}

}
