package ss4;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class bai3 {

    public static void main(String[] args) {

        int numberOfTransactions = 50_000;
        List<String> transactions = new ArrayList<>();

        for (int i = 1; i <= numberOfTransactions; i++) {
            transactions.add("BOOK-" + i + " | 2026-01-28");
        }

        long startString = System.currentTimeMillis();

        String report1 = "Thời gian tạo báo cáo: "
                + LocalDateTime.now() + "\n";

        for (String t : transactions) {
            report1 += t + "\n";
        }

        long endString = System.currentTimeMillis();

        long startBuilder = System.currentTimeMillis();

        StringBuilder report2 = new StringBuilder();
        report2.append("Thời gian tạo báo cáo: ")
                .append(LocalDateTime.now())
                .append("\n");

        for (String t : transactions) {
            report2.append(t).append("\n");
        }

        long endBuilder = System.currentTimeMillis();

        System.out.println("Thời gian dùng String (+): "
                + (endString - startString) + " ms");

        System.out.println("Thời gian dùng StringBuilder: "
                + (endBuilder - startBuilder) + " ms");
    }
}
