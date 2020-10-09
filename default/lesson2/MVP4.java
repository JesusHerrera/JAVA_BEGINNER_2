package lesson2;

/*4.Create a square two-dimensional integer array (the number of rows and columns is the same)
 * use the loop (s) to fill its diagonal elements with units/1;
 */
public class MVP4 {
	public int[][] diagonal() {
		int dimension[][] = new int[5][5];
		int i;
		int j;
		for (i = 0; i < dimension.length; i++) {
			for (j = 0; j < dimension.length; j++) {
				if (i == j || dimension.length - i == j + 1) {
					dimension[i][i] = dimension[i][dimension.length - i - 1] = 2;
				} else {
					dimension[i][i] = 0;
				}
				System.out.print(dimension[i][j]);
			}
			System.out.println();
		}
		return dimension;
	}
}