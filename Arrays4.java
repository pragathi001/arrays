package arrays;

import java.util.Scanner;

public class Arrays4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length = sc.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < length; i++) {

			arr[i] = sc.nextInt();
		}
		int sume = 0;
		int sumo = 0;
		for (int y : arr) {
			if (y % 2 == 0) {
				sume += y;
			} else {
				sumo += y;

			}

		}
		System.out.println("even  numbers are" + sume);
		System.out.println("odd numbers are" + sumo);

	}

}
