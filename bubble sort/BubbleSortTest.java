import java.util.Arrays;


public class BubbleSortTest {
    public static void main(String[] args) {
        int[] numbers = {8, 3, 1, 4, 5, 11, 7, 2, 17, 13};
        bubbleSort(numbers);
        System.out.println("Swapped array is:");
        printArray(numbers);
    }

    static void bubbleSort(int[] numbers) {
        int n = numbers.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;
                }
            }
        }
    }

    static void printArray(int[] numbers) {
        for (int value : numbers) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}