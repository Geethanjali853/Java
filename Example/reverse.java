import java.util.Scanner;

public class reverse {
    
    //Recursive function to reverse the array in place
    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        //Swap elements
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        //Recursive call
        reverseArray(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Part 2: Reverse array using recursion
        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter array elements: ");
        for(int i = 0; i < size; i++) {
            arr[i] =scanner.nextInt();
        }

        reverseArray(arr, 0, size - 1);

        System.out.println("Reversed array: ");
        for(int num : arr) {
            System.out.println(num + " ");
        }

        scanner.close();
    }
}
