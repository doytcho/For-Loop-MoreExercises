import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int minDifrence = Integer.MAX_VALUE;
        int maxDifrence = Integer.MIN_VALUE;
        int sum = 0;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            int number1 = Integer.parseInt(scan.nextLine());
            int number2 = Integer.parseInt(scan.nextLine());
            sum = number1 + number2;
            if (sum > maxDifrence) {
                maxDifrence = sum;
            }
            if (sum < minDifrence) {
                minDifrence = sum;
            }
        }
        if (minDifrence == maxDifrence) {
            System.out.printf("Yes, value=%d", minDifrence);
        } else {
            System.out.printf("No, maxdiff=%d", maxDifrence - minDifrence);
        }

    }
}
