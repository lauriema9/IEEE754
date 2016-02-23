import java.util.Scanner;

public class Temperature {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double temp[][] = inputTempForYear();
		System.out.println("Month\tHigh\tLow");
		for (int i = 0; i < 12; i++) {
			System.out.print((i + 1) + "\t");
			for (int j = 0; j < 2; j++) {
				System.out.print(temp[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("The average of high temperature is "
				+ calculateAverageHigh(temp));
		System.out.println("The average of low temperature is "
				+ calculateAverageLow(temp));
		System.out.println("The highest temperature of year is "
				+ temp[findHighestTemp(temp)][0]);
		System.out.println("The lowest temperature of year is "
				+ temp[findLowestTemp(temp)][1]);
	}

	//
	public static void inputTempForMonth(int month, double temp[][]) {
		System.out
				.println("Enter highest Temperature  for month " + (month + 1));
		Scanner input = new Scanner(System.in);
		double high = input.nextDouble();
		System.out.println("Enter lowest Temperature  for month "
				+ (month + 1));
		double low = input.nextDouble();
		temp[month][0] = high;
		temp[month][1] = low;

		// System.out.println("the highest temperature is " + x + "\n" +
		// "the lowest temperature is " + y);
	}

	public static double[][] inputTempForYear() {
		final int ROW = 12;
		final int COL = 2;
		double temp[][] = new double[ROW][COL];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 12; i++) {
			inputTempForMonth(i, temp);
		}
		return temp;
	}

	public static double calculateAverageHigh(double temp[][]) {
		final int ROW = 12;
		final int COL = 2;
		double sum = 0;
		double ave = 0;
		int i = 0;
		for (i = 0; i < ROW; i++) {
			sum = sum + temp[i][0];
		}
		ave = sum / (i);

		return ave;
	}

	public static double calculateAverageLow(double temp[][]) {
		final int ROW = 12;
		final int COL = 2;
		double sum = 0;
		double ave = 0;
		int i = 0;
		for (i = 0; i < ROW; i++) {
			sum = sum + temp[i][1];
		}
		ave = sum / (i);

		return ave;
	}

	public static int findHighestTemp(double temp[][]){
		final int ROW = 12;
		final int COL = 2;
		int indexOfHigh = 1;
		double highTemp=temp[0][0];
		for (int i = 0; i < ROW; i++) {
			if(temp[i][0] > highTemp)
			{
				indexOfHigh=i;
				highTemp=temp[i][0];
			}
		}

		return indexOfHigh;
}
	public static int findLowestTemp(double temp[][]){
		final int ROW = 12;
		final int COL = 2;
		int indexOfLow = 1;
		double lowTemp=temp[0][0];
		for (int i = 0; i < ROW; i++) {
			if(temp[i][1] <lowTemp)
			{
				indexOfLow=i;
				lowTemp=temp[i][1];
			}
		}

		return indexOfLow;
	}
}
