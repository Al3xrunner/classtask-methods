package project4_refactor;

import java.util.Scanner;

public class Project4Refactor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            showMenu();
            String op = sc.nextLine().trim();

            if ("1".equals(op)) {
                part1Syntax();
            } else if ("2".equals(op)) {
                part2SimpleDialog(sc);
            } else if ("3".equals(op)) {
                part3ImprovedDialog(sc);
            } else if ("4".equals(op)) {
                part4RepeatWholeConversation(sc);
            } else if ("0".equals(op)) {
                break;
            } else {
                System.out.println("Invalid option.");
            }

            if (!returnToMenu(sc)) break;
        }
        sc.close();
    }

    static void showMenu() {
        System.out.println("\n=== Project 4 Menu ===");
        System.out.println("1) Part 1. Syntax");
        System.out.println("2) Part 2. Simple dialog with loop");
        System.out.println("3) Part 3. Improved dialog with loop");
        System.out.println("4) Part 4. Repeat whole conversation");
        System.out.println("0) Exit");
        System.out.print("Choose: ");
    }

    // Part 1. Syntax
    static void part1Syntax() {
        // while
        int w = 1;
        while (w <= 3) {
            System.out.println(w);
            w++;
        }
        // do while
        int d = 1;
        do {
            System.out.println(d);
            d++;
        } while (d <= 3);

        // for
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }

        // 1..10 (i++)
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + (i < 10 ? " " : "\n"));
        }
        // 10..1 (i--)
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + (i > 1 ? " " : "\n"));
        }

        // iterate String
        String s = "Hello";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

        // nested loop
        for (int i = 1; i <= 3; i++) {
            System.out.print("i=" + i + " j:");
            for (int j = 1; j <= 3; j++) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }

    // Part 2. Simple dialog with loop
    static void part2SimpleDialog(Scanner sc) {
        while (true) {
            System.out.print("Enter any string: ");
            String input = sc.nextLine();
            System.out.println(input.toUpperCase());

            System.out.print("Continue? (Y/N): ");
            if (!sc.nextLine().trim().equalsIgnoreCase("y")) break;
        }
    }

    // Part 3. Improved dialog with loop
    static void part3ImprovedDialog(Scanner sc) {
        while (true) {
            System.out.print("Enter any string: ");
            String input = sc.nextLine();

            StringBuilder rev = new StringBuilder();
            for (int i = input.length() - 1; i >= 0; i--) {
                rev.append(input.charAt(i));
            }
            System.out.println(rev.toString());

            System.out.print("Continue? (Y/N): ");
            if (!sc.nextLine().trim().equalsIgnoreCase("y")) break;
        }
    }

    // Part 4. Put previous Project (3.3) into loop
    static void part4RepeatWholeConversation(Scanner sc) {
        do {
            System.out.print("Enter any string: ");
            String input = sc.nextLine();

            StringBuilder rev = new StringBuilder();
            for (int i = input.length() - 1; i >= 0; i--) {
                rev.append(input.charAt(i));
            }
            System.out.println(rev.toString());

            System.out.print("Repeat whole conversation? (Y/N): ");
        } while (sc.nextLine().trim().equalsIgnoreCase("y"));
    }

    static boolean returnToMenu(Scanner sc) {
        System.out.print("Return to menu? (Y/N): ");
        return sc.nextLine().trim().equalsIgnoreCase("y");
    }
}
