import java.util.Scanner;

public class Occurence {
    
    //Function to count occurence of digit D in number N
    public static int countDigitOccurences(int N, int D) {
        int count = 0;
        while(N > 0) {
            if (N % 10 == D) {
                count++;
            }
            N /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Part1: Count ovvurences of D in N
        System.out.println("Enter number N: ");
        int N = scanner.nextInt();
        System.out.println("Enter digit D: ");
        int D = scanner.nextInt();

        int count = countDigitOccurences(N, D);
        System.out.println("Digit " + D + " occurs " + count + " times in " + N);

        scanner.close();
    }
}
