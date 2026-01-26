package ss2;
import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap tuoi: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Nhap so sach dang muon: ");
        int currentBooks = Integer.parseInt(sc.nextLine());

        if (age >= 18 && currentBooks < 3) {
            System.out.println("Cho phep muon sach");
        } else {
            if (age < 18) {
                System.out.println("Ban chua du tuoi");
            }
            if (currentBooks >= 3) {
                System.out.println("Ban da muon qua so luong cho phep");
            }
        }
    }
}