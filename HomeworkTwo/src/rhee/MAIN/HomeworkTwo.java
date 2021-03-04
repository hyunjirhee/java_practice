package rhee.MAIN;

public class HomeworkTwo {

	// TASK 0
	public static void displayArray1D(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void displayArray1D(double[] arr) {
		for (double i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void displayArray1D(String[] arr) {
		for (String i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void displayArray2D(int[][] arr) {
		for (int[] i : arr) {
			for (int number : i) {
				System.out.print(number + " ");
			}
		}
		System.out.println();
	}

	public static void displayArray2D(double[][] arr) {
		for (double[] i : arr) {
			for (double number : i) {
				System.out.print(number + " ");
			}
		}
		System.out.println();
	}

	public static void displayArray2D(String[][] arr) {
		for (String[] i : arr) {
			for (String number : i) {
				System.out.print(number + " ");
			}
		}
		System.out.println();
	}

	// TASK 00
	public static boolean checkForSquare(int[][] arr) {
		int row = 0;
		int col = 0;
		int firstRow = arr[0].length;
		int numRow = 0;

		for (int[] i : arr) {
			for (int j : i) {
				row++;
			}
			col++;
			if (firstRow != row) {
				return false;
			} else {
				row = 0;
				numRow++;
			}
		}
		if (numRow == col) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean checkForSquare(double[][] arr) {
		int row = 0;
		int col = 0;
		int firstRow = arr[0].length;
		int numRow = 0;

		for (double[] i : arr) {
			for (double j : i) {
				row++;
			}
			col++;
			if (firstRow != row) {
				return false;
			} else {
				row = 0;
				numRow++;
			}
		}
		if (numRow == col) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean checkForSquare(String[][] arr) {
		int row = 0;
		int col = 0;
		int firstRow = arr[0].length;
		int numRow = 0;

		for (String[] i : arr) {
			for (String j : i) {
				row++;
			}
			col++;
			if (firstRow != row) {
				return false;
			} else {
				row = 0;
				numRow++;
			}
		}
		if (numRow == col) {
			return true;
		} else {
			return false;
		}

	}

	// TASK 1
	public static int sumEvenValues(int[][] arr) {
		int sum = 0;
		for (int[] i : arr) {
			for (int number : i) {

				switch (number % 2) {
				case 0:
					sum += number;
				case 1:
					continue;
				default:
					break;
				}
			}
		}
		return sum;
	}

	// TASK 2
	public static int countOddValues(int[][] arr) {
		int count = 0;
		if (checkForSquare(arr) == false) {
			System.out.println("Input Is Not Square");
			return 0;
		}
		for (int[] i : arr) {
			for (int number : i) {
				if (number % 2 == 1)
					count++;
			}
		}
		return count;
	}

	// TASK 3
	public static int[] arrayMinMax(int[][] arr) {
		int[] minMax = new int[2];

		// initialize min, max from the first value of the array
		int min = arr[0][0];
		int max = arr[0][0];

		for (int[] i : arr) {
			for (int number : i) {
				if (number < min) {
					min = number;
				} else if (number > max) {
					max = number;
				}
			}
		}
		minMax[0] = min;
		minMax[1] = max;

		return minMax;
	}

	// TASK 4
	public static int[] changeArrayDimensions(int[][] arr) {
		int[] newArray = new int[arr.length * arr[0].length];
		int index = 0;
		for (int[] i : arr) {
			for (int number : i) {
				newArray[index++] = number;
			}
		}

		return newArray;
	}

	// TASK 5
	public static int[][] mainDiagonal1() {
		int[][] newArray = new int[3][3];
		for (int i = 0; i < newArray.length; i++) {
			for (int j = 0; j < newArray[i].length; j++) {
				if (i == j) {
					newArray[i][j] = 1;
				} else {
					newArray[i][j] = 0;
				}
			}
		}
		return newArray;
	}

	// TASK 6
	public static String[][] formattedArray(double[][] arr) {

		String[][] newArray = new String[3][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] >= 1000) {
					newArray[i][j] = String.format("%,.2f", arr[i][j]);
					// newArray[i][j] = String.valueOf((int) arr[i][j] / 1000) + "," +
					// String.valueOf(arr[i][j] % 1000.00);
				}
				if (arr[i][j] < 1000) {
					for (int k = 0; k < arr.length; k++) {
						for (int l = 0; l < arr[k].length; l++) {
							newArray[k][l] = "SW";
						}
					}
					return newArray;
				}
			}
		}
		return newArray;
	}

	// TASK 7
	public static int sumProduct(int... num) {
		int sum = 0;
		int mult = 1;

		for (int i : num) {
			System.out.print(i + " ");
			sum += i;
			mult *= i;
		}
		System.out.println();

		return sum * mult;

	}

	// TASK 8
	public static String[][] not5Inverses(int[][] arr) {
		String[][] newArray = new String[arr.length][arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] >= 5) {
					newArray[i][j] = String.valueOf(Math.round((1.0 / arr[i][j]) * 100) / 100.0);
				}
				if (arr[i][j] < 5) {
					for (int k = 0; k < arr.length; k++) {
						for (int l = 0; l < arr[k].length; l++) {
							newArray[k][l] = "X";
						}
					}
					return newArray;

				}
			}
		}
		return newArray;
	}

	public static void main(String[] args) {
		System.out.println();
		System.out.println("TASK 1");
		System.out.println();
		// Task 1
		int[][] v1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int value = sumEvenValues(v1);
		System.out.println(value);

		System.out.println();
		System.out.println("TASK 2");
		System.out.println();

		// Task 2
		int[][] v2A = { { 11, 2, 36 }, { 41, 50, 6 }, { 7, 18, 9 } };
		int[][] v2B = { { 11, 36 }, { 41, 50, 6 }, { 7, 18, 9 } };
		int countA = countOddValues(v2A);
		System.out.println(countA);
		int countB = countOddValues(v2B);
		System.out.println(countB);

		System.out.println();
		System.out.println("TASK 3");
		System.out.println();

		// Task 3
		int[][] v3 = { { 1, 2, 3 }, { 4, 51, 6 }, { 7, 8, 9 } };
		int[] minMax = arrayMinMax(v3);
		displayArray1D(minMax);

		System.out.println();
		System.out.println("TASK 4");
		System.out.println();

		// Task 4
		int[][] v4 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[] cd = changeArrayDimensions(v4);
		displayArray1D(cd);

		System.out.println();
		System.out.println("TASK 5");
		System.out.println();

		// Task 5
		int[][] v5 = mainDiagonal1();
		displayArray2D(v5);

		System.out.println();
		System.out.println("TASK 6");
		System.out.println();

		// Task 6
		double[][] v6A = { { 1000, 2000, 3000 }, { 4000.86, 5000, 6000 }, { 7000, 8000.4, 9000 } };
		double[][] v6B = { { 1000.7, 2000, 3000 }, { 40, 5000, 6000 }, { 7000, 8000.92, 9000 } };
		String[][] A6A = formattedArray(v6A);
		String[][] A6B = formattedArray(v6B);
		displayArray2D(A6A);
		displayArray2D(A6B);

		System.out.println();
		System.out.println("TASK 7");
		System.out.println();

		// Task 7
		int a = sumProduct(1, 2, 3, 4, 5);
		System.out.println(a);
		int b = sumProduct(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(b);

		System.out.println();
		System.out.println("TASK 8");
		System.out.println();

		// Task 8
		int[][] v8A = { { 11, 12, 13 }, { 14, 15, 16 }, { 17, 18, 19 } };
		int[][] v8B = { { 1, 12, 13 }, { 14, 15, 16 }, { 17, 18, 19 } };
		String[][] c8A = not5Inverses(v8A);
		String[][] c8B = not5Inverses(v8B);
		displayArray2D(c8A);
		displayArray2D(c8B);

	}
}