package ss3;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] books = {
                "Lap trinh Java",
                "Cau truc du lieu va giai thuat",
                "Co so du lieu"
        };

        System.out.print("Nhập tên sách cần tìm: ");
        String searchName = scanner.nextLine();

        int result = -1;

        for (int i = 0; i < books.length; i++) {
            if (books[i].equalsIgnoreCase(searchName)) {
                result = i;
                break;
            }
        }

        if (result != -1) {
            System.out.println("Tìm thấy tại vị trí " + result);
        } else {
            System.out.println("Sách không tồn tại");
        }
    }
}
