package ss7;

class ScoreUtils {

    public static boolean checkPass(double score) {
        return score >= 5.0;
    }

    public static double calculateAverage(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }
}

public class bai3 {
    public static void main(String[] args) {

        double[] scores = {6.5, 8.0, 4.5};

        System.out.println("Danh sach diem: 6.5, 8.0, 4.5");
        System.out.println(">> Ket qua xu ly:");

        double avg = ScoreUtils.calculateAverage(scores);
        System.out.println("- Diem trung binh ca lop: "+ String.format("%.2f", avg));

        for (double score : scores) {
            if (ScoreUtils.checkPass(score)) {
                System.out.println("- Diem " + score + ": Dat");
            } else {
                System.out.println("- Diem " + score + ": Truot");
            }
        }
    }
}
