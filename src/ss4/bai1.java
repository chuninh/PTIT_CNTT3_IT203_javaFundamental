package ss4;

import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sách: ");
        String bookName = sc.nextLine();

        System.out.print("Nhập tên tác giả: ");
        String authorName = sc.nextLine();

        System.out.print("Nhập thể loại: ");
        String category = sc.nextLine();

        bookName = bookName.trim().replaceAll("\\s+", " ");
        authorName = authorName.trim().replaceAll("\\s+", " ");
        category = category.trim().replaceAll("\\s+", " ");

        bookName = bookName.toUpperCase();

        String[] words = authorName.toLowerCase().split(" ");
        String formattedAuthor = "";

        for (String word : words) {
            formattedAuthor += word.substring(0, 1).toUpperCase()
                    + word.substring(1) + " ";
        }

        formattedAuthor = formattedAuthor.trim();

        // Nối chuỗi kết quả
        String result = bookName + " - Tác giả: " + formattedAuthor;

        System.out.println(result);
    }
}
