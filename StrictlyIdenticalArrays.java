//Shaan Santhosh ITSS 3311
import java.util.Scanner; // This allows the program to obtain the user's input

class StrictlyIdenticalArrays {

	public static boolean equals(int arr1[], int arr2[]) { // This line checks if both of the arrays are equal.
		for (int i=0;i<arr1.length;i++) { // This for loop checks the length of both arrays.
			if(arr1[i]!=arr2[i]) { // This if statement checks if the number of digits is equal.
				return false; // If not true, it will return false to the computer.
			}
		}
		return true; // This will return true if the amount of numbers is right
	}
  
	public static void main(String[] args) { // This will focus on receiving the input.
		Scanner input = new Scanner(System.in); // This allows the program to receive user input.
		System.out.print("Enter 5 elements of the list 1 : "); // This displays the user to type the first list.
		int l1[] = new int[5]; // This will declare all the integers that were typed.
		int l2[] = new int[5];
		for(int i=0;i<5;i++) { // This for loop checks if the five digits were typed.
			l1[i] = input.nextInt();
		}
		System.out.print("Enter 5 elements of the list 2 : "); // Telling the user to type in the next list.
		for(int i=0;i<5;i++){ // This for loop will check the 2nd list of numbers to see if there is 5 digits.
			l2[i] = input.nextInt();
		}
		boolean ans = equals(l1,l2); // This is checking if the answer is true or false.
		if(ans) { // This if statement displays information if the lists aren't identical or if they are identical.
			System.out.println("Two lists are strictly identical");
		}
		else{
	
			System.out.println("Two list are not strictly identical");
		}
		input.close();
	}
	}

// SAMPLE RUN TEST
// Enter 5 elements of the list 1 : 1 2 3 4 5
// Enter 5 elements of the list 2 : 1 2 3 4 5
// Two lists are strictly identical