package ss4;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mã thẻ thư viện: ");
        String cardCode = sc.nextLine();

        Pattern fullPattern = Pattern.compile("^[A-Z]{2}[0-9]{9}$");
        Matcher fullMatcher = fullPattern.matcher(cardCode);

        if (fullMatcher.matches()) {
            System.out.println("Mã thẻ hợp lệ.");
            return;
        }

        Pattern prefixPattern = Pattern.compile("^[A-Z]{2}.*");
        if (!prefixPattern.matcher(cardCode).matches()) {
            System.out.println("Lỗi: Thiếu hoặc sai tiền tố (phải là 2 chữ cái in hoa).");
            return;
        }

        Pattern yearPattern = Pattern.compile("^[A-Z]{2}[0-9]{4}.*");
        if (!yearPattern.matcher(cardCode).matches()) {
            System.out.println("Lỗi: Năm vào học không hợp lệ (phải gồm 4 chữ số).");
            return;
        }

        Pattern randomPattern = Pattern.compile("^[A-Z]{2}[0-9]{4}[0-9]{5}$");
        if (!randomPattern.matcher(cardCode).matches()) {
            System.out.println("Lỗi: Mã ngẫu nhiên phải gồm đúng 5 chữ số.");
            return;
        }

        System.out.println("Mã thẻ không hợp lệ.");
    }
}
