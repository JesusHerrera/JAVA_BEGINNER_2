package lesson2;

/*1.Set an integer array consisting of elements 0 and 1. 
 * for Example: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. 
 * Use the loop and conditional statement to replace 0 with 1, 1 with 0
 */
public class MVP1 {
	public int[] replaceitems() {
		int zeros[] = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
		{ // Declare an array with ten elements

			System.out.println("Original array is: ");
			for (int i = 0; i < zeros.length; i++)// for loop reads elements inside the array
				System.out.println(" " + zeros[i]);// Display original array

			System.out.println("After swapping elements it becomes ");
			for (int i = 0; i < zeros.length; i++) { // Start a loop to read elements inside the array
				if (zeros[i] == 0) {// conditional statement is declared
					zeros[i] = 1; // If expression is true, the index becomes 1
				} else if (zeros[i] == 1)// Otherwise, index becomes 0
					zeros[i] = 0;
				System.out.println(" " + zeros[i]); //Print array with new arrangement
			}
		}
		return zeros;
	}
}