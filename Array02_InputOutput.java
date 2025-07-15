import java.util.Scanner;

public class Array02_InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("The array elements are:");
        for (int i = 0; i < n; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }

        scanner.close();
    }
}
