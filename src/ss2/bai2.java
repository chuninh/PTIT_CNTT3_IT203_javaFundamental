package ss2;
import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma the loai sach (A, B, C, D): ");
        char code = sc.nextLine().toUpperCase().charAt(0);

        switch (code) {
            case 'A':
                System.out.println("Tang 1: Sach Van hoc");
                break;
            case 'B':
                System.out.println("Tang 2: Sach Khoa hoc");
                break;
            case 'C':
                System.out.println("Tang 3: Sach Ngoai ngu");
                break;
            case 'D':
                System.out.println("Tang 4: Sach Tin hoc");
                break;
            default:
                System.out.println("Ma the loai khong hop le");
        }
    }
}
