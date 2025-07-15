import java.util.Scanner;

public class Array18_FindIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter element to find index: ");
        int x = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) System.out.println("Element not found in array.");
        sc.close();
    }
}
