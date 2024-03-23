import java.util.Scanner;

public class BinarySearch1 {
    // Iterative Binary Search
    public static int binarySearchIterative(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
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
        int iterativeResult = binarySearchIterative(sortedArray, target);
        if(index==-1){
            System.out.println("Iterative Binary Search: Element not found at index ");

        }
        else{
            System.out.println("Iterative Binary Search: Element " + target + " found at index " + iterativeResult);

        }
    }
}
