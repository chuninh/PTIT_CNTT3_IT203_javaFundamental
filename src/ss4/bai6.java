package ss4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai6 {

    public static void main(String[] args) {

        String review = "Cuốn sách này noi dung rat xau va te.";

        String[] blacklist = { "xau", "te" };

        String regex = "(?i)\\b(" + String.join("|", blacklist) + ")\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(review);

        StringBuffer filteredReview = new StringBuffer();

        while (matcher.find()) {
            String badWord = matcher.group();
            String stars = "*".repeat(badWord.length());
            matcher.appendReplacement(filteredReview, stars);
        }
        matcher.appendTail(filteredReview);

        String result = filteredReview.toString();

        if (result.length() > 200) {
            int cutIndex = result.lastIndexOf(" ", 200);

            if (cutIndex == -1) {
                cutIndex = 200;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(result.substring(0, cutIndex));
            sb.append("...");

            result = sb.toString();
        }

        System.out.println("Nội dung sau xử lý:");
        System.out.println(result);
    }
}
