package ss15;
import java.util.PriorityQueue;
import java.util.Comparator;

public class bai4 {

    static class EmergencyPatient {
        private String id;
        private String name;
        private int priority; // 1: cấp cứu, 2: thường
        private long arrivalOrder; // đảm bảo FIFO cùng mức độ

        public EmergencyPatient(String id, String name, int priority, long arrivalOrder) {
            this.id = id;
            this.name = name;
            this.priority = priority;
            this.arrivalOrder = arrivalOrder;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getPriority() {
            return priority;
        }

        public long getArrivalOrder() {
            return arrivalOrder;
        }

        @Override
        public String toString() {
            String level = (priority == 1) ? "CẤP CỨU" : "THƯỜNG";
            return "Mã: " + id + " | Tên: " + name + " | Mức độ: " + level;
        }
    }

    static class EmergencyQueue {

        private PriorityQueue<EmergencyPatient> queue;
        private long counter = 0; // tăng dần để đảm bảo FIFO

        public EmergencyQueue() {
            queue = new PriorityQueue<>(new Comparator<EmergencyPatient>() {
                @Override
                public int compare(EmergencyPatient p1, EmergencyPatient p2) {

                    // Ưu tiên theo mức độ trước
                    if (p1.getPriority() != p2.getPriority()) {
                        return Integer.compare(p1.getPriority(), p2.getPriority());
                    }

                    // Nếu cùng mức độ -> so theo thứ tự đến (FIFO)
                    return Long.compare(p1.getArrivalOrder(), p2.getArrivalOrder());
                }
            });
        }

        public void addPatient(String id, String name, int priority) {
            EmergencyPatient patient =
                    new EmergencyPatient(id, name, priority, counter++);
            queue.offer(patient);
            System.out.println("Đã tiếp nhận: " + patient);
        }

        public EmergencyPatient callNextPatient() {
            if (queue.isEmpty()) {
                System.out.println("Không có bệnh nhân nào.");
                return null;
            }
            EmergencyPatient next = queue.poll();
            System.out.println("Đang khám: " + next);
            return next;
        }

        public void displayQueue() {
            if (queue.isEmpty()) {
                System.out.println("Danh sách trống.");
                return;
            }

            System.out.println("===== DANH SÁCH CHỜ =====");
            for (EmergencyPatient p : queue) {
                System.out.println(p);
            }
        }
    }

    public static void main(String[] args) {

        EmergencyQueue eq = new EmergencyQueue();

        eq.addPatient("BN01", "Nguyen Van A", 2);
        eq.addPatient("BN02", "Tran Thi B", 1);
        eq.addPatient("BN03", "Le Van C", 2);
        eq.addPatient("BN04", "Pham Van D", 1);

        System.out.println("\n--- Gọi khám theo thứ tự ưu tiên ---");

        while (true) {
            EmergencyPatient p = eq.callNextPatient();
            if (p == null) break;
        }
    }
}
