package ss2;
import java.util.Scanner;
public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 100;
        int daysLate;

        System.out.println("Nhap so ngay tre cua moi lan tra sach (999 de ket thuc):");

        daysLate = Integer.parseInt(sc.nextLine());

        while (daysLate != 999) {
            if (daysLate <= 0) {
                score += 5;
                System.out.println("-> Tra dung han: +5 diem");
            } else {
                int minus = daysLate * 2;
                score -= minus;
                System.out.println("-> Tra tre " + daysLate + " ngay: -" + minus + " diem");
            }


            daysLate = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Tong diem uy tin cuoi cung: " + score);

        if (score > 120) {
            System.out.println("Xep loai: DOC GIA THAN THIET");
        } else if (score >= 80) {
            System.out.println("Xep loai: DOC GIA TIEU CHUAN");
        } else {
            System.out.println("Xep loai: DOC GIA CAN LUU Y");
        }
    }
}
