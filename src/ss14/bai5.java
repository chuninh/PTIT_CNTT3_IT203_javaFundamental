package ss14;
import java.util.Comparator;
import java.util.TreeSet;

class Patient {
    String name;
    int severity;
    int arrivalTime;

    public Patient(String name, int severity, int arrivalTime) {
        this.name = name;
        this.severity = severity;
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return name + " (Mức " + severity + ", đến lúc " + arrivalTime + ")";
    }
}

public class bai5 {

    public static void main(String[] args) {

        Comparator<Patient> comparator = new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {

                if (p1.severity != p2.severity) {
                    return Integer.compare(p1.severity, p2.severity);
                }

                if (p1.arrivalTime != p2.arrivalTime) {
                    return Integer.compare(p1.arrivalTime, p2.arrivalTime);
                }
                return p1.name.compareTo(p2.name);
            }
        };

        TreeSet<Patient> hangDoi = new TreeSet<>(comparator);

        hangDoi.add(new Patient("Bệnh nhân A", 3, 800));
        hangDoi.add(new Patient("Bệnh nhân B", 1, 815));
        hangDoi.add(new Patient("Bệnh nhân C", 1, 805));

        System.out.println("Thứ tự xử lý:");
        for (Patient p : hangDoi) {
            System.out.println(p);
        }
    }
}