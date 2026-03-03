package ss15;
import java.util.Stack;

public class bai1 {

    static class EditAction {
        private String description;
        private String time;

        public EditAction(String description, String time) {
            this.description = description;
            this.time = time;
        }

        public String getDescription() {
            return description;
        }

        public String getTime() {
            return time;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Thời gian: " + time + " | Nội dung: " + description;
        }
    }

    static class MedicalRecordHistory {
        private Stack<EditAction> history;

        public MedicalRecordHistory() {
            history = new Stack<>();
        }

        public void addEdit(EditAction action) {
            history.push(action);
            System.out.println("Đã thêm chỉnh sửa.");
        }

        public EditAction undoEdit() {
            if (!history.isEmpty()) {
                EditAction removed = history.pop();
                System.out.println("Đã hoàn tác: " + removed);
                return removed;
            } else {
                System.out.println("Không có chỉnh sửa để hoàn tác.");
                return null;
            }
        }

        public EditAction getLatestEdit() {
            if (!history.isEmpty()) {
                return history.peek();
            } else {
                System.out.println("Stack rỗng.");
                return null;
            }
        }

        public boolean isEmpty() {
            return history.isEmpty();
        }

        public void displayHistory() {
            if (history.isEmpty()) {
                System.out.println("Chưa có chỉnh sửa nào.");
            } else {
                System.out.println("===== LỊCH SỬ CHỈNH SỬA =====");
                for (int i = history.size() - 1; i >= 0; i--) {
                    System.out.println(history.get(i));
                }
            }
        }
    }

    public static void main(String[] args) {

        MedicalRecordHistory history = new MedicalRecordHistory();

        history.addEdit(new EditAction("Thêm chẩn đoán viêm họng", "10:00"));
        history.displayHistory();

        history.addEdit(new EditAction("Cập nhật toa thuốc", "10:15"));
        history.displayHistory();

        history.addEdit(new EditAction("Chỉnh sửa liều lượng thuốc", "10:30"));
        history.displayHistory();

        System.out.println("\nChỉnh sửa gần nhất (peek):");
        System.out.println(history.getLatestEdit());

        System.out.println("\nThực hiện Undo (pop):");
        history.undoEdit();
        history.displayHistory();
    }
}