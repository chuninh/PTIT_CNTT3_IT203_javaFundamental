package ss15;
import java.util.Stack;

public class bai3 {
    static class MedicationProcessChecker {
        private Stack<String> stack;
        public MedicationProcessChecker() {
            stack = new Stack<>();
        }

        public boolean checkProcess(String[] actions) {

            for (int i = 0; i < actions.length; i++) {

                String action = actions[i];

                if (action.equalsIgnoreCase("PUSH")) {
                    stack.push("Phát thuốc");
                    System.out.println("Bước " + (i + 1) + ": PUSH -> Thêm vào Stack");
                }

                else if (action.equalsIgnoreCase("POP")) {

                    if (stack.isEmpty()) {
                        System.out.println("Bước " + (i + 1) + ": POP nhưng Stack đang rỗng -> Quy trình KHÔNG hợp lệ");
                        return false;
                    }

                    stack.pop();
                    System.out.println("Bước " + (i + 1) + ": POP -> Hoàn tất phát thuốc");
                }

                else {
                    System.out.println("Bước " + (i + 1) + ": Hành động không hợp lệ");
                    return false;
                }
            }

            if (!stack.isEmpty()) {
                System.out.println("Kết thúc ca trực nhưng vẫn còn thuốc chưa hoàn tất -> Quy trình KHÔNG hợp lệ");
                return false;
            }

            System.out.println("Quy trình hợp lệ. Stack rỗng khi kết thúc.");
            return true;
        }

        public void reset() {
            stack.clear();
        }
    }

    public static void main(String[] args) {

        MedicationProcessChecker checker = new MedicationProcessChecker();

        System.out.println("===== KIỂM TRA QUY TRÌNH 1 =====");
        String[] process1 = {"PUSH", "PUSH", "POP", "POP"};
        checker.checkProcess(process1);

        checker.reset();

        System.out.println("\n===== KIỂM TRA QUY TRÌNH 2 =====");
        String[] process2 = {"PUSH", "POP", "POP"};
        checker.checkProcess(process2);

        checker.reset();

        System.out.println("\n===== KIỂM TRA QUY TRÌNH 3 =====");
        String[] process3 = {"PUSH", "PUSH", "POP"};
        checker.checkProcess(process3);
    }
}