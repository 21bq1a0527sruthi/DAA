import java.util.Scanner;

public class BinarySearch2 {

    // Recursive Binary Search
    public static int binarySearchRecursive(int[] arr, int target, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                return binarySearchRecursive(arr, target, mid + 1, high);
            } else {
                return binarySearchRecursive(arr, target, low, mid - 1);
            }
        }
        return -1; // Element not found
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the sorted array: ");
        int size = scanner.nextInt();

        int[] sortedArray = new int[size];
        System.out.println("Enter the elements of the sorted array:");

        for (int i = 0; i < size; i++) {
            sortedArray[i] = scanner.nextInt();
        }

        System.out.print("Enter the target element to search: ");
        int target = scanner.nextInt();

        // Recursive Binary Search
        int recursiveResult = binarySearchRecursive(sortedArray, target, 0, sortedArray.length - 1);
        System.out.println("Recursive Binary Search: Element " + target + " found at index " + recursiveResult);

        scanner.close();
    }
}
