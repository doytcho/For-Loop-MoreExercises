import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int doctors = 7;
        int pacientsFucked = 0;
        int pacientsFuckedTemp = 0;
        int pacientsNotFucked = 0;
        int pacientsNotFuckedTemp = 0;
        int every3Days = 1;
        int days = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < days; i++) {
            int pacients = Integer.parseInt(scan.nextLine());
            if (pacientsFucked > pacientsNotFucked && every3Days == 3) {
                doctors++;
                every3Days = 0;
            }
            if (pacients <= doctors) {
                pacientsNotFuckedTemp = pacients;
                pacientsFuckedTemp = 0;
            } else {
                pacientsNotFuckedTemp = doctors;
                pacientsFuckedTemp = pacients - doctors;
            }
            pacientsNotFucked = pacientsNotFucked + pacientsNotFuckedTemp;
            pacientsFucked = pacientsFucked + pacientsFuckedTemp;
            every3Days++;
        }
        System.out.printf("Treated patients: %d.%n", pacientsNotFucked);
        System.out.printf("Untreated patients: %d.", pacientsFucked);
    }
}
