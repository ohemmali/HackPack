
public class PascalTriangle {

	// Limit > 34 will overflow int
	// Limit > 67 will overflow long
	// Modding will have to be used for any value larger
	public static long[][] getValues(int limit) {

		long[][] triangle = new long[limit+1][];

		triangle[0] = new long[] { 1, 0 };

		for (int i = 1; i <= limit; i++) {
			triangle[i] = new long[i + 2];
			triangle[i][0] = 1;
			for (int j = 1; j <= i; j++) {
				triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
			}
		}

		return triangle;
	}

}
