package ss15;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class bai5 {

    static class Patient {
        private String id;
        private String name;
        private int age;

        public Patient(String id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Mã: " + id + " | Tên: " + name + " | Tuổi: " + age;
        }
    }

    static class TreatmentStep {
        private String description;
        private String time;

        public TreatmentStep(String description, String time) {
            this.description = description;
            this.time = time;
        }

        @Override
        public String toString() {
            return "Thời gian: " + time + " | Bước: " + description;
        }
    }

    static class EmergencyCase {
        private Patient patient;
        private Stack<TreatmentStep> steps;

        public EmergencyCase(Patient patient) {
            this.patient = patient;
            this.steps = new Stack<>();
        }

        public void addStep(TreatmentStep step) {
            steps.push(step);
            System.out.println("Đã thêm bước xử lý.");
        }

        public TreatmentStep undoStep() {
            if (steps.isEmpty()) {
                System.out.println("Không có bước nào để hoàn tác.");
                return null;
            }
            TreatmentStep removed = steps.pop();
            System.out.println("Đã hoàn tác: " + removed);
            return removed;
        }

        public void displaySteps() {
            if (steps.isEmpty()) {
                System.out.println("Chưa có bước xử lý.");
                return;
            }

            System.out.println("===== CÁC BƯỚC XỬ LÝ =====");
            for (int i = steps.size() - 1; i >= 0; i--) {
                System.out.println(steps.get(i));
            }
        }

        public Patient getPatient() {
            return patient;
        }
    }

    static class EmergencyCaseQueue {
        private Queue<EmergencyCase> cases;

        public EmergencyCaseQueue() {
            cases = new LinkedList<>();
        }

        public void addCase(EmergencyCase c) {
            cases.offer(c);
            System.out.println("Đã tiếp nhận ca: " + c.getPatient());
        }

        public EmergencyCase getNextCase() {
            if (cases.isEmpty()) {
                System.out.println("Không còn ca cấp cứu nào.");
                return null;
            }
            EmergencyCase next = cases.poll();
            System.out.println("Đang xử lý: " + next.getPatient());
            return next;
        }
    }

    public static void main(String[] args) {

        EmergencyCaseQueue queue = new EmergencyCaseQueue();

        EmergencyCase case1 = new EmergencyCase(
                new Patient("BN01", "Nguyen Van A", 45));
        EmergencyCase case2 = new EmergencyCase(
                new Patient("BN02", "Tran Thi B", 30));

        queue.addCase(case1);
        queue.addCase(case2);

        System.out.println("\n--- Bắt đầu xử lý ca đầu tiên ---");

        EmergencyCase current = queue.getNextCase();

        if (current != null) {
            current.addStep(new TreatmentStep("Tiếp nhận bệnh nhân", "08:00"));
            current.addStep(new TreatmentStep("Chẩn đoán ban đầu", "08:05"));
            current.addStep(new TreatmentStep("Tiêm thuốc giảm đau", "08:10"));

            current.displaySteps();

            System.out.println("\nHoàn tác bước gần nhất:");
            current.undoStep();

            current.displaySteps();
        }
    }
}