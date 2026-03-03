package ss14;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class bai4 {

    public static void main(String[] args) {

        List<String> danhSachBenh = new ArrayList<>();
        danhSachBenh.add("Cúm A");
        danhSachBenh.add("Sốt xuất huyết");
        danhSachBenh.add("Cúm A");
        danhSachBenh.add("Covid-19");
        danhSachBenh.add("Cúm A");
        danhSachBenh.add("Sốt xuất huyết");

        Map<String, Integer> thongKe = new TreeMap<>();

        for (String benh : danhSachBenh) {
            if (thongKe.containsKey(benh)) {
                thongKe.put(benh, thongKe.get(benh) + 1);
            } else {
                thongKe.put(benh, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : thongKe.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ca");
        }
    }
}