package week3;

public class arrays {

	public static void main(String[] args) {
/* Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
*		Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] 
*		in your code). Print the result to the console.
*		Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
*		Use a loop to iterate through the array and calculate the average age. Print the result to the console.
*/
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };
		int first = ages[0];
		int last = ages[ages.length-1];
		int dif = first - last;
		System.out.println("Subtract the value of the 1st element from the last element is " + dif);
//	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
//	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
	
		int[] ages2 = { 3, 9, 23, 64, 2, 8, 28, 93, 3 };
		int first2 = ages2[0];
		int last2 = ages2[ages2.length-1];
		int dif2 = first2 - last2;
		System.out.println("Subtract the value of the 1st element from the last element is " + dif2);
	//Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		double sum = 0;
		double avg = 0;
		
		for(int x = 0;x <= ages2.length-1;x++) {
		
			sum = sum + ages2[x];
			if (x > 0) {
				avg = sum / x;
				}
			System.out.println("Average is " + avg);
		
		}
		                                
/*
Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.

How do you access the last element of any array?
array[array.length-1]
How do you access the first element of any array?
array[0]		
 */
		
		String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};

//Use a loop to iterate through the array and calculate the average number of letters per name.
		double sum2 = 0;
		double avg2 = 0;
		
		for(int y = 0;y <= names.length-1;y++) {
		
			sum2 = sum2 + names[y].length();
			if (y > 0) {
				avg2 = sum2 / y;
				}
			System.out.println("Average is " + avg2);		
		}
//Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		for(int z= 0;z <= names.length-1;z++) {
			System.out.print(names[z] + " ");
		}
/*
Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
 */		
		int[] nameLengths = new int[names.length];
		for(int i = 0; i < names.length;i++) {
			String name = names[i];
			nameLengths[i] = name.length();
		}
		int sum3 = 0;
		for(int h = 0; h <= nameLengths.length-1; h++) {
			sum3 = sum3 + nameLengths[h];
			System.out.println("Sum is: " + sum3);
		}
	}


	
}
	
