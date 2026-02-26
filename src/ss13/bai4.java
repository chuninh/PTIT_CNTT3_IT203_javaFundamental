package ss13;

import java.util.LinkedList;
import java.util.HashSet;

public class bai4{

    static class EmergencyRoom {

        private LinkedList<String> waitingList = new LinkedList<>();
        private HashSet<String> emergencyPatients = new HashSet<>();

        public void patientCheckIn(String name) {
            waitingList.addLast(name);
        }

        public void emergencyCheckIn(String name) {
            waitingList.addFirst(name);
            emergencyPatients.add(name);
        }

        public void treatPatient() {
            if (waitingList.isEmpty()) {
                System.out.println("Không còn bệnh nhân.");
                return;
            }

            String patient = waitingList.removeFirst();

            if (emergencyPatients.contains(patient)) {
                System.out.println("Đang cấp cứu: " + patient);
                emergencyPatients.remove(patient);
            } else {
                System.out.println("Đang khám: " + patient);
            }
        }
    }

    public static void main(String[] args) {

        EmergencyRoom er = new EmergencyRoom();

        er.patientCheckIn("A");
        er.patientCheckIn("B");
        er.emergencyCheckIn("C");

        er.treatPatient();
        er.treatPatient();
        er.treatPatient();
    }
}