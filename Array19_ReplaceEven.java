import java.util.Scanner;

public class Array19_ReplaceEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) arr[i] = -1;
        }

        System.out.println("Array after replacing even numbers with -1:");
        for (int value : arr) System.out.print(value + " ");
        sc.close();
    }
}
