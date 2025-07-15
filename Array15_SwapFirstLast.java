import java.util.Scanner;

public class Array15_SwapFirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        if (n >= 2) {
            int temp = arr[0];
            arr[0] = arr[n - 1];
            arr[n - 1] = temp;
        }

        System.out.println("Array after swapping first and last elements:");
        for (int value : arr) System.out.print(value + " ");
        sc.close();
    }
}
