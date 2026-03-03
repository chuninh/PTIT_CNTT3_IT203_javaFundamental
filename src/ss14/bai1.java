package ss14;

import java.util.LinkedHashSet;
import java.util.Set;

public class bai1 {
    public static void main(String[] args) {

        Set<String> patients = new LinkedHashSet<>();

        patients.add("Nguyễn Văn A – Yên Bái");
        patients.add("Trần Thị B – Thái Bình");
        patients.add("Nguyễn Văn A – Yên Bái");
        patients.add("Lê Văn C – Hưng Yên");

        System.out.println("Danh sách gọi khám:");
        for (String name : patients) {
            System.out.println(name);
        }
    }
}