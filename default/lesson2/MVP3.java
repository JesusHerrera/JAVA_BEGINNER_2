package lesson2;

/*3.Set an array [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
 *  go through it in a loop, and multiply numbers less than 6 by 2;
 */
public class MVP3 {
	public int[] multiply() {
		int multi[] = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
		{

			for (int i = 0; i < multi.length; i++) {
				if (multi[i] < 6) {
					multi[i] *= 2;
				}
				System.out.println("\t" + multi[i]);
			}
		}
		return multi;
	}
}