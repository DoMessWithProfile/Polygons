import java.util.Scanner;

public class Input {
    /*
     * Created by Michael Lam
     * Last updated: 17/09/2022
     */
    private static Scanner scanner = new Scanner(System.in);

    public static int getInt(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static double getDouble(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static String getString(String prompt) {
        System.out.print(prompt);
        return scanner.next();
    }

    public static String getLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static boolean getBoolean(String prompt) {
        System.out.print(prompt);
        return scanner.nextBoolean();
    }

    public static char getChar(String prompt) {
        System.out.print(prompt);
        return scanner.next().charAt(0);
    }

    public static void close() {
        scanner.close();
    }
}
