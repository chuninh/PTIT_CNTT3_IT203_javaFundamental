package ss3;

import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] books = {101, 203, 305, 407, 509};
        int n = 5;

        while (true) {
            System.out.println("Danh sách sách hiện tại:");
            if (n == 0) {
                System.out.println("Mảng rỗng, không còn sách để xóa.");
                break;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(books[i] + " ");
            }
            System.out.println();

            System.out.print("Nhập mã sách cần xóa: ");
            int bookId = scanner.nextInt();

            int index = -1;
            for (int i = 0; i < n; i++) {
                if (books[i] == bookId) {
                    index = i;
                    break;
                }
            }

            if (index == -1) {
                System.out.println("Không tìm thấy sách cần xóa.");
            } else {

                for (int i = index; i < n - 1; i++) {
                    books[i] = books[i + 1];
                }
                n--;
                System.out.println("Đã xóa sách có mã: " + bookId);
            }

            System.out.print("Bạn có muốn tiếp tục xóa không? (y/n): ");
            char choice = scanner.next().charAt(0);
            if (choice == 'n' || choice == 'N') {
                break;
            }
        }

        System.out.println("Chương trình kết thúc.");
    }
}
