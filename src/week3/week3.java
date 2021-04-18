package week3;

import java.util.Arrays;

public class week3 {

//	Create an array of int called ages 
	static int ages[] = {3, 9, 23, 64, 2, 8, 28, 93, 103};

//	Create an array of String called names 
	static String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

//	Create a new array of int called nameLengths
	static int[] nameLengths = new int[names.length];
	
//	Creating an array of numbers	
	static int arrayOfNumbers[] = {10, 20, 30, 45, 55, 60};

//	Creating an array of doubles	
	static double arrayOfDoubles[] = {10.5, 20.25, 30.75};

//	Creating another array of doubles	
	static double arrayOfDoubles2[] = {11.5, 21.25, 31.75};
	
//	Creating boolean isHotOutside, and a double moneyInPocket
	static boolean isHotOutside = true;
	static double moneyInPocket = 10.50;
	
//	Creating own variables
	static boolean inAGoodArea = true;
	static double rent = 1000.00;
	static int amenities = 5;

	public static void main(String[] args) {
	
//		Programmatically subtract the value of the first element in the array 
//		from the value in the last element of the array 
		int subtractFirstFromLastElement = ages[ages.length - 1] - ages[0];

		System.out.println(ages[ages.length - 1] + " minus " + ages[0] + " equals " + subtractFirstFromLastElement);

//		Use a loop to iterate through the array and calculate the average age
		System.out.println("The average age is... " + avaerageAgeOfArray(ages));
		
//		Use a loop to iterate through the array (of names) and calculate the average 
//		number of letters per name
		new week3().averageNumberOfLetters();

//		Use a loop to iterate through the array again and concatenate all the 
//		names together, separated by spaces
//		System.out.println(Arrays.asList(names)); //Not this way, but neat
		for(int index = 0; index < names.length; index +=1) {
			String name = names[index];
			System.out.print(name + " ");
		}
		System.out.println(""); //Just wanted to make a break for the next part

//		Write a loop to iterate over the nameLengths array and calculate the 
//		sum of all the elements in the array
		int sum2 = 0;
		for(int index = 0; index < nameLengths.length; index +=1) {
			sum2 += nameLengths[index];
		}
		System.out.println("There should be " + sum2 + " characters above, not including spaces.");
		
//		Write a method that takes a String, word, and an int, n, as arguments 
//		and returns the word concatenated to itself n number of times. 
		System.out.println(concatWordNumberOfTimes("Hello", 3));

//		Write a method that takes two Strings, firstName and lastName, and 
//		returns a full name (the full name should be the first and the last 
//		name as a String separated by a space)
		System.out.println(concat2WordsWithASpace("Hello", "World"));
		
//		Write a method that takes an array of int and returns true if the sum 
//		of all the ints in the array is greater than 100
		if (greaterThanHundredQuestionMark(arrayOfNumbers) == true) {
			System.out.println("The sum of all the numbers is greater than 100");
		}
		else
			System.out.println("The sum of all the numbers is less than 100");
			
//		Write a method that takes an array of double and returns the average 
//		of all the elements in the array.
		System.out.println("The average of this doubles array is... " + averageOfDoubleArray(arrayOfDoubles));
		
//		Write a method that takes two arrays of double and returns true if the 
//		average of the elements in the first array is greater than the average 
//		of the elements in the second array.
		if (doubleTrouble(arrayOfDoubles, arrayOfDoubles2) == true) {
			System.out.println("The first array has a higher average");
		}
		else
			System.out.println("The second array has a higher average");
		
//		Write a method called willBuyDrink that takes a boolean isHotOutside, 
//		and a double moneyInPocket, and returns true if it is hot outside and 
//		if moneyInPocket is greater than 10.50
		if (willBuyDrink(isHotOutside, moneyInPocket) == true) {
			System.out.println("Let's buy milk!");
		}
		else
			System.out.println("Let's wait on the milk.");
		
//		Create a method of your own that solves a problem. Currently in the 
//		process of moving, so thought this would be cute to do.
		System.out.println(foundANewPlace(inAGoodArea, rent, amenities));
	}

/**
 * Write a method that takes two arrays of double and returns true if the 
 * average of the elements in the first array is greater than the average 
 * of the elements in the second array.
 * @param arrayOfDoubles3
 * @param arrayOfDoubles4
 * @return
 */
	private static boolean doubleTrouble(double[] arrayOfDoubles3, double[] arrayOfDoubles4) {
		double sum3 = 0;
		double average3 = 0;
		double sum4 = 0;
		double average4 = 0;

		for (double array : arrayOfDoubles3) {
			sum3 += array;
		}
		average3 = sum3 / arrayOfDoubles3.length;

		for (double array : arrayOfDoubles4) {
			sum4 += array;
		}
		average4 = sum4 / arrayOfDoubles4.length;
				
		return average3 > average4;
	}

/**
 * Use a loop to iterate through the array and calculate the average age
 * @param ages2
 * @return
 */
	private static double avaerageAgeOfArray(int[] ages2) {
		int sum = 0;
		double average = 0;

		for (int ages : ages2) {
			sum += ages;
		}
		average = sum / ages2.length;

		return average;
	}

/**
 * Use a loop to iterate through the array (of names) and calculate the average 
 * number of letters per name
 */
	private void averageNumberOfLetters() {
		int sum = 0;
		double average = 0;
		
		for(int index = 0; index < names.length; index +=1) {
			String name = names[index];
			nameLengths[index] = name.length();
			sum += name.length();
			average = sum / nameLengths.length;
		}
		System.out.println("The average number of letters is... " + average);
	}

/**
 * 	Write a method that takes a String, word, and an int, n, as arguments 
 *	and returns the word concatenated to itself n number of times.
 * @param word
 * @param numberOfTimes
 * @return
 */
	private static String concatWordNumberOfTimes(String word, int numberOfTimes) {
		String concat = "";
		
		for(int index = 0; index < numberOfTimes; index++) {
			concat += word;
		}

		return concat;
	}

/**
 * 	Write a method that takes two Strings, firstName and lastName, and 
 *	returns a full name (the full name should be the first and the last 
 *	name as a String separated by a space)
 * @param word1
 * @param word2
 * @return
 */
	private static String concat2WordsWithASpace(String word1, String word2) {
		String fullName = word1 + " " + word2;

		return fullName;
	}

/**
 * Write a method that takes an array of int and returns true if the sum 
 * of all the ints in the array is greater than 100
 * @param array2
 * @return
 */
	private static boolean greaterThanHundredQuestionMark(int[] array2) {
		int sum = 0;

		for (int numbers : array2) {
			sum += numbers;
		}
		boolean hundredQuestion = sum > 100;

		return hundredQuestion;
	}

/**
 * Write a method that takes two arrays of double and returns true if the 
 * average of the elements in the first array is greater than the average 
 * of the elements in the second array.
 * @param arrayOfDoubles2
 * @return
 */
	private static double averageOfDoubleArray(double[] arrayOfDoubles2) {
		double sum = 0;
		double average = 0;

		for (double array : arrayOfDoubles2) {
			sum += array;
		}
		average = sum / arrayOfDoubles2.length;

		return average;
	}

/**
 * Write a method called willBuyDrink that takes a boolean isHotOutside, 
 * and a double moneyInPocket, and returns true if it is hot outside and 
 * if moneyInPocket is greater than 10.50
 * @param isHotOutside2
 * @param moneyInPocket2
 * @return
 */
	private static boolean willBuyDrink(boolean isHotOutside2, double moneyInPocket2) {
		if ( isHotOutside2 = true && moneyInPocket2 > 10.50 ) {
			return true;
		}
		else 
			return false;
	}

/**
 * Create a method of your own that solves a problem. Currently in the 
 * process of moving, so thought this would be cute to do.
 * @param inAGoodArea2
 * @param rent2
 * @param amenities2
 * @return
 */
	private static String foundANewPlace(boolean inAGoodArea2, double rent2, int amenities2) {	
		if(inAGoodArea2 = true && rent2 <= 1000 && amenities2 >=5) {
			return "Time to move.";
		}
		else
			return "Time to stay.";
	}

}
