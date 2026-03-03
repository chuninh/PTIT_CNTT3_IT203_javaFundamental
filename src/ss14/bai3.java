package ss14;
import java.util.HashSet;
import java.util.Set;

public class bai3 {

    public static void main(String[] args) {

        Set<String> thuocMoi = new HashSet<>();
        thuocMoi.add("Aspirin");
        thuocMoi.add("Caffeine");
        thuocMoi.add("Paracetamol");

        Set<String> diUng = new HashSet<>();
        diUng.add("Penicillin");
        diUng.add("Aspirin");

        Set<String> canhBao = new HashSet<>(thuocMoi);
        canhBao.retainAll(diUng);

        Set<String> thanhPhanAnToan = new HashSet<>(thuocMoi);
        thanhPhanAnToan.removeAll(diUng);

        System.out.println("Thuốc: " + thuocMoi);
        System.out.println("Dị ứng: " + diUng);
        System.out.println("Cảnh báo dị ứng: " + canhBao);
        System.out.println("Thành phần an toàn: " + thanhPhanAnToan);
    }
}