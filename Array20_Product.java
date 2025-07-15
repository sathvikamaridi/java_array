import java.util.Scanner;

public class Array20_Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        long product = 1;
        for (int value : arr) product *= value;

        System.out.println("Product of all elements = " + product);
        sc.close();
    }
}
