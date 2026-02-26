package ss13;
import java.util.LinkedList;

public class bai4 {

    static class EmergencyRoom {

        private LinkedList<String> waitingList = new LinkedList<>();

        public void patientCheckIn(String name) {
            waitingList.addLast(name);
        }

        public void emergencyCheckIn(String name) {
            waitingList.addFirst(name);
        }

        public void treatPatient() {
            if (waitingList.isEmpty()) {
                System.out.println("Không còn bệnh nhân.");
                return;
            }

            String patient = waitingList.removeFirst();
            System.out.println("Đang khám: " + patient);
        }
    }

    public static void main(String[] args) {

        EmergencyRoom er = new EmergencyRoom();

        er.patientCheckIn("A");
        er.patientCheckIn("B");
        er.emergencyCheckIn("C");

        System.out.println("Đang cấp cứu: " + er.waitingList.removeFirst());
        er.treatPatient();
        er.treatPatient();
    }
}