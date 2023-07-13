import java.util.Scanner;

public class testshift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Shifting one digit to the left
        int lastElement = numbers[size - 1];
        for (int i = size - 1; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[0] = lastElement;

        System.out.println("Array after shifting one digit to the left:");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
