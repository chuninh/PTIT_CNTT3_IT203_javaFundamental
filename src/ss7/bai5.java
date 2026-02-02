package ss7;

public class bai5 {

    static class Config {
        public static final double MAX_SCORE = 10.0;
        public static final double MIN_SCORE = 0.0;
        public static final double PASS_SCORE = 5.0;
    }

    static class ScoreUtils {

        public static boolean checkPass(double score) {
            return score >= Config.PASS_SCORE;
        }

        public static double calculateAverage(double[] scores) {
            double sum = 0;
            for (double s : scores) {
                sum += s;
            }
            return sum / scores.length;
        }
    }

    public static void main(String[] args) {
        // Config.MAX_SCORE = 20; nếu có dòng nãy sẽ lỗi biên dịch vì final
        double[] scores = {6.5, 8.0, 4.5};

        System.out.println("Danh sach diem:");
        for (double s : scores) {
            System.out.println("- " + s);
        }

        double avg = ScoreUtils.calculateAverage(scores);
        System.out.printf("\n>> Diem trung binh: %.2f\n", avg);

        System.out.println(">> Ket qua tung diem:");
        for (double s : scores) {
            if (s < Config.MIN_SCORE || s > Config.MAX_SCORE) {
                System.out.println("- " + s + ": KHONG HOP LE");
            } else {
                System.out.println("- " + s + ": " +
                        (ScoreUtils.checkPass(s) ? "Dat" : "Truot"));
            }
        }
    }
}
