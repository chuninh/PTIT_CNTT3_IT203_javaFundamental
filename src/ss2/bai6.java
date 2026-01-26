package ss2;
import java.util.Scanner;
public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 1;
        int min = 1;
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Nhap so luot muon cua ngay thu " + i + ": ");
            int borrow = Integer.parseInt(sc.nextLine());

            if (borrow == 0) {
                continue;
            }

            if (borrow > max) {
                max = borrow;
            }

            if (borrow < min) {
                min = borrow;
            }

            sum += borrow;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;

            System.out.println("Luot muon cao nhat: " + max);
            System.out.println("Luot muon thap nhat: " + min);
            System.out.println("Trung binh luot muon (cac ngay mo cua): " + average);
        } else {
            System.out.println("Khong co ngay nao mo cua trong tuan");
        }
    }
}
