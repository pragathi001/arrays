package arrays;

import java.util.Scanner;

public class Arrays5 {
	public static void main(String[] args) {

		System.out.println("Enter the length of the array");

		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int arr[] = new int[length];
		System.out.print("Enter  the elements of the array");
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();

		}
		for (int i = 0; i < length; i++) {
			System.out.print(Math.abs(arr[i]) + " ");
		}
	}
}
