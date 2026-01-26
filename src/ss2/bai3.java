package ss2;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so luong sach tra muon: ");
        int n = Integer.parseInt(sc.nextLine());

        int total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Nhap so ngay tre cua cuon sach thu " + i + ": ");
            int daysLate = Integer.parseInt(sc.nextLine());

            total += daysLate * 5000;
        }

        System.out.println("Tong so tien phat: " + total + " VND");
    }
}
