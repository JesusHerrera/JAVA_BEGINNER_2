package lesson2;

/*2.Set an empty integer array of size 8.
 * use the loop to fill it with the values 0 3 6 9 12 15 18 21;
 */
public class MVP2 {
	public int[] populatearray() {
		int populate[] = new int[8];//Declare and initialize an empty array of size 8

		for (int i = 0; i < populate.length; i++) {//Create a loop to read elements of the array
			populate[i] = i * 3; //Populate array by multiplying each iteration by 3
			System.out.println(populate[i]);//Display the elements of the array
		}
		return populate;
	}
}
