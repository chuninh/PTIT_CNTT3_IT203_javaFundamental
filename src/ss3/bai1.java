package ss3;

import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng sách: ");
        int n = scanner.nextInt();

        int[] books = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập mã sách thứ " + (i + 1) + ": ");
            books[i] = scanner.nextInt();
        }

        System.out.print("Danh sách mã sách: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i]);
            if (i < books.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
