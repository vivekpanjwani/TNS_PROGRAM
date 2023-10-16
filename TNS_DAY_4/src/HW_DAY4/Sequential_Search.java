package HW_DAY4;

import java.util.Scanner;

public class Sequential_Search {
    private static Scanner scanner;

	public static int sequentialSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  // Element found, return its index
            }
        }
        return -1;  // Element not found
    }

    public static void main(String[] args) {
        int[] numbers = {15, 3, 9, 2, 7, 11, 6, 8};

        scanner = new Scanner(System.in);
        System.out.print("Enter the target element to search for: ");
        int target = scanner.nextInt();

        int result = sequentialSearch(numbers, target);
        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result + ".");
        } else {
            System.out.println("Element " + target + " not found in the list.");
        }
    }
}
