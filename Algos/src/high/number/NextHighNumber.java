package high.number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NextHighNumber {
	public static void main(String[] args) throws IOException
	{
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(System.in));
		String number = null;

		// Reading data using readLine
		while(number == null) {
			System.out.println("Enter a valid number:");
			number = reader.readLine();
			if (!number.matches("[0-9]+")) {
				System.out.println("Invalid number");
				number = null;
			}
		}
		char inputNumber[] = number.toCharArray();
		calculateNextHighNumber(inputNumber);
		System.out.println(inputNumber);
	}

	//Function to find the next highest number
	static void calculateNextHighNumber(char[] currentNumber) {
		if (currentNumber == null) {
			System.out.println("Cannot execute on null number.");
			return;
		}
		int length = currentNumber.length;
		int i;
		//This will ensure that it doesnot fail for number length 1
		for (i = length- 1; i > 0; i--)
		{
			if (currentNumber[i] > currentNumber[i - 1]) {
				break;
			}
		}
		//when i = 0; The current number is the biggest number and hence we return the current number
		if(i == 0) {
			System.out.println("Current Number is the Biggest Number.");
		}
		else {
			//Try to find the next minimum number on right
			int startingPoint = currentNumber[i-1];
			int minPosition = i;
			for (int j = i + 1; j < length; j++)
			{
				if (currentNumber[j] > startingPoint && currentNumber[j] < currentNumber[minPosition])
				{
					minPosition = j;
				}
			}
			//Once the next smallest number is found then swap them
			swap(currentNumber, i-1, minPosition);
			//Need to sort the rest of the array from i to the length of the array
			Arrays.sort(currentNumber, i, length);
		}
	}

	// function to swap two digit in the array
	static void swap(char digit[], int i, int j)
	{
		int length = digit != null? digit.length: -1;
		if(i > length || j > length) {
			System.out.println("Invalid Input Array Passed.");
			return;
		}
		char temp = digit[i];
		digit[i] = digit[j];
		digit[j] = temp;
	}
}
