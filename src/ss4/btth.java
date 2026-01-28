package ss4;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Date;

public class btth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id;
        String isbn;
        int year;

        Pattern patternId = Pattern.compile("LIB-[0-9]{4}-S");
        Matcher matcherId;

        do {
            System.out.print("Nhập ID sách: ");
            id = sc.nextLine();
            matcherId = patternId.matcher(id);

            if (!matcherId.matches()) {
                System.out.println("ID sai định dạng! Nhập lại.");
            }
        } while (!matcherId.matches());

        Pattern patternISBN = Pattern.compile("[0-9]{10}");
        Matcher matcherISBN;

        do {
            System.out.print("Nhập ISBN: ");
            isbn = sc.nextLine();
            matcherISBN = patternISBN.matcher(isbn);

            if (!matcherISBN.matches()) {
                System.out.println("ISBN sai định dạng! Nhập lại.");
            }
        } while (!matcherISBN.matches());

        int currentYear = new Date().getYear() + 1900;

        do {
            System.out.print("Nhập năm xuất bản: ");
            year = Integer.parseInt(sc.nextLine());

            if (year < 1000 || year > currentYear) {
                System.out.println("Năm xuất bản không hợp lệ! Nhập lại.");
            }
        } while (year < 1000 || year > currentYear);

        System.out.println("Dữ liệu hợp lệ:");
        System.out.println("ID: " + id);
        System.out.println("ISBN: " + isbn);
        System.out.println("Năm xuất bản: " + year);
    }
}
