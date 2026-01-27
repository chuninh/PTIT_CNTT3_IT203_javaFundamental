package ss3;

import java.util.Scanner;
public class bai5 {

    public static int deleteBook(int[] arr, int n, int bookId) {
        int index = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == bookId) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Không tìm thấy mã sách cần xóa.");
            return n;
        }

        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        n--;
        System.out.println("Đã xóa mã sách " + bookId);
        return n;
    }

    public static void displayBooks(int[] arr, int n) {
        if (n == 0) {
            System.out.println("Danh sách rỗng.");
            return;
        }

        System.out.print("Danh sách sách: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] books = {101, 102, 103, 104, 105};
        int n = 5;

        while (n > 0) {
            displayBooks(books, n);

            System.out.print("Nhập mã sách cần xóa: ");
            int bookId = sc.nextInt();

            n = deleteBook(books, n, bookId);

            if (n == 0) {
                System.out.println("Không còn sách nào trong danh sách.");
                break;
            }

            System.out.print("Bạn có muốn xóa tiếp không? (y/n): ");
            char choice = sc.next().charAt(0);
            if (choice != 'y' && choice != 'Y') {
                break;
            }
        }
    }
}