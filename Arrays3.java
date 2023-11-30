package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays3 {
public static void main(String[] args) {
	Scanner  sc = new Scanner(System.in);
	System.out.println("Enter the length of the array");

	
int	length = sc.nextInt();
	int arr[]=new int[length];
	System.out.print("Enter  the elements of the array");
	
	for(int i=0;i<length;i++) {
		arr[i]=sc.nextInt();
		
	}
	Arrays.sort(arr);
	int  min=arr[0];
	int max = arr[arr.length-1];
	

System.out.println(min);
System.out.println(max);

}
}
