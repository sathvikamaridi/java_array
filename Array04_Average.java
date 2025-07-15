import java.util.Scanner;

public class Array04_Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        int sum = 0;
        for (int num : arr) sum += num;

        double average = (double) sum / n;
        System.out.println("Average = " + average);
        scanner.close();
    }
}
