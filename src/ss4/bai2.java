package ss4;

import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mô tả sách: ");
        String description = sc.nextLine();

        if (description.contains("Kệ:")) {

            int keIndex = description.indexOf("Kệ:");
            int start = keIndex + "Kệ:".length();

            int commaIndex = description.indexOf(",", start);

            String shelfCode;

            if (commaIndex != -1) {
                shelfCode = description.substring(start, commaIndex).trim();
            } else {
                shelfCode = description.substring(start).trim();
            }

            System.out.println("Mã vị trí kệ: " + shelfCode);

            String newDescription =
                    description.replace("Kệ:", "Vị trí lưu trữ:");

            System.out.println("Mô tả sau khi thay thế:");
            System.out.println(newDescription);

        } else {
            System.out.println("Không tìm thấy thông tin kệ sách trong mô tả.");
        }
    }
}
