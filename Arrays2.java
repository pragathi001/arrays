package arrays;

import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length = sc.nextInt();
		int arr[] = new int[length];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("how many times rotate:");
		int noOfTimes = sc.nextInt();
		for (int i = 0; i < noOfTimes; i++) {
			int first = arr[0];
			for (int j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];

			}
			arr[arr.length - 1] = first;
		}
		System.out.println();
		for (int l = 0; l < arr.length; l++) {
			System.out.println(arr[l] + " ");
		}
	}

}