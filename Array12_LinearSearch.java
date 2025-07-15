import java.util.Scanner;

public class Array12_LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int x = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println(x + " found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) System.out.println(x + " not found in array.");
        sc.close();
    }
}