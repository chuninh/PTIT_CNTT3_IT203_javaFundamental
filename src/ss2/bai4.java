package ss2;
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bookId;
        do {
            System.out.print("Nhap ma ID sach: ");
            bookId = Integer.parseInt(sc.nextLine());

            if (bookId <= 0) {
                System.out.println("Ma khong hop le, hay nhap lai");
            }

        } while (bookId <= 0);

        System.out.println("Luu ma sach thanh cong");
    }
}
