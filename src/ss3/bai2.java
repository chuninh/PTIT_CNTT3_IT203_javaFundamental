package ss3;

import java.util.Scanner;

public class bai2{

    public static int searchBooks(String[] arr, String search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(search)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = {
                "Lap trinh Java",
                "Cau truc du lieu",
                "Giai thuat",
                "Co so du lieu",
                "Mang may tinh"
        };

        System.out.print("Nhập tên sách cần tìm: ");
        String search = sc.nextLine();

        int result = searchBooks(books, search);

        if (result != -1) {
            System.out.println("Tìm thấy tại vị trí " + result);
        } else {
            System.out.println("Sách không tồn tại");
        }
    }
}