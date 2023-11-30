package arrays;

import java.util.Scanner;

public class Arrays1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length = sc.nextInt();
		int[] arr = new int[length];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < length; i++) {

			arr[i] = sc.nextInt();
		}
		System.out.println("Even numbers are ");

		for (int y : arr) {
			if (y % 2 == 0) {
				System.out.println(y + "");

			}

		}
		System.out.println("Odd numbers are");

		for (int y : arr) {
			if (y % 2 != 0) {
				System.out.println(y + "");

			}

		}
	}
}