import java.util.Scanner;

public class SortView {
    public int getInputSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        return n;
    }

    public int displayMenu() {
        System.out.println("Choose a sorting algorithm:");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Quick Sort");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1, 2, or 3): ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

    public void printArray(int[] array, String message) {
        System.out.println(message);
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
