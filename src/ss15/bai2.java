package ss15;
import java.util.LinkedList;
import java.util.Queue;

public class bai2 {

    static class Patient {
        private String id;
        private String name;
        private int age;

        public Patient(String id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Mã: " + id + " | Tên: " + name + " | Tuổi: " + age;
        }
    }

    static class PatientQueue {
        private Queue<Patient> queue;

        public PatientQueue() {
            queue = new LinkedList<>();
        }

        public void addPatient(Patient p) {
            queue.offer(p);
            System.out.println("Đã thêm bệnh nhân vào hàng chờ.");
        }

        public Patient callNextPatient() {
            if (!queue.isEmpty()) {
                Patient p = queue.poll();
                System.out.println("Đang khám: " + p);
                return p;
            } else {
                System.out.println("Không có bệnh nhân nào trong hàng chờ.");
                return null;
            }
        }

        public Patient peekNextPatient() {
            if (!queue.isEmpty()) {
                return queue.peek();
            } else {
                System.out.println("Hàng chờ rỗng.");
                return null;
            }
        }

        public boolean isEmpty() {
            return queue.isEmpty();
        }

        public void displayQueue() {
            if (queue.isEmpty()) {
                System.out.println("Không có bệnh nhân đang chờ.");
            } else {
                System.out.println("===== DANH SÁCH BỆNH NHÂN CHỜ =====");
                for (Patient p : queue) {
                    System.out.println(p);
                }
            }
        }
    }

    public static void main(String[] args) {

        PatientQueue pq = new PatientQueue();

        pq.addPatient(new Patient("BN01", "Nguyen Van A", 25));
        pq.displayQueue();

        pq.addPatient(new Patient("BN02", "Tran Thi B", 30));
        pq.displayQueue();

        pq.addPatient(new Patient("BN03", "Le Van C", 40));
        pq.displayQueue();

        System.out.println("\nBệnh nhân tiếp theo sẽ được khám (peek):");
        System.out.println(pq.peekNextPatient());

        System.out.println("\nGọi khám (dequeue):");
        pq.callNextPatient();
        pq.displayQueue();
    }
}