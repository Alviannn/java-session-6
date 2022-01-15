import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

//    Ya/Tidak
//    Aplikasi persetujuan
//    1. Ya
//    2. Tidak

    public Main() {
//        File file = new File("test.txt");
//        FileWriter fw = new FileWriter(file);

        Scanner scan = new Scanner(System.in);
//        int[] buff = new int[1024 * 8];

        while (true) {
//            buff = new int[buff.length * 2];

            clearScreen();
            System.out.println("Apakah anda setuju dengan x?\n" +
                               "1. Ya\n" +
                               "2. Tidak");
            System.out.print(">> ");

            int choice;
            try {
                choice = scan.nextInt();
                scan.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Input harus angka!");
                scan.nextLine();
                scan.nextLine();
                continue;
            }

//            // clear buffer
//            scan.nextLine();

            if (choice == 1) {
                System.out.println("Anda setuju dengan x!");
            } else if (choice == 2) {
                System.out.println("Anda tidak setuju dengan x!");
            } else {
                System.out.println("Pilihan salah!");
            }

            scan.nextLine();
            scan.close();
        }
    }

    void clearScreen() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Main();
    }

}
