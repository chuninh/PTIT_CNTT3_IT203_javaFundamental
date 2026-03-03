package ss14;

import java.util.*;
class BenhNhan {
    String name;
    int age;
    String department;
    public BenhNhan(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return name + " (" + age + " tuổi)";
    }
}

public class bai6 {
    public static void main(String[] args) {
        List<BenhNhan> danhSach = new ArrayList<>();
        danhSach.add(new BenhNhan("Lan", 25, "Tim mạch"));
        danhSach.add(new BenhNhan("Hùng", 40, "Nội tiết"));
        danhSach.add(new BenhNhan("Mai", 30, "Tim mạch"));

        Map<String, List<BenhNhan>> mapKhoa = new HashMap<>();

        for (BenhNhan bn : danhSach) {
            mapKhoa.putIfAbsent(bn.department, new ArrayList<>());
            mapKhoa.get(bn.department).add(bn);
        }
        System.out.println("Danh sách theo khoa:");
        for (Map.Entry<String, List<BenhNhan>> entry : mapKhoa.entrySet()) {
            System.out.println("Khoa " + entry.getKey() + " -> " + entry.getValue());
        }
        String khoaCanXem = "Tim mạch";
        System.out.println("\nBệnh nhân tại khoa " + khoaCanXem + ":");
        List<BenhNhan> dsKhoa = mapKhoa.get(khoaCanXem);
        if (dsKhoa != null) {
            for (BenhNhan bn : dsKhoa) {
                System.out.println(bn);
            }
        } else {
            System.out.println("Không có khoa này.");
        }

        String khoaDongNhat = "";
        int max = 0;
        for (Map.Entry<String, List<BenhNhan>> entry : mapKhoa.entrySet()) {
            int size = entry.getValue().size();
            if (size > max) {
                max = size;
                khoaDongNhat = entry.getKey();
            }
        }
        System.out.println("\nKhoa " + khoaDongNhat + " đang đông nhất (" + max + " bệnh nhân).");
    }
}