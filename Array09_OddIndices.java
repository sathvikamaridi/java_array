import java.util.Scanner;

public class Array09_OddIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Elements at odd indices:");
        for (int i = 1; i < n; i += 2) {
            System.out.println("Index " + i + ": " + arr[i]);
        }
        sc.close();
    }
}