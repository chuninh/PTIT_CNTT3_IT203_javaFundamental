package ss13;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class bai5 {

    static class Patient {
        private String id;
        private String fullName;
        private int age;
        private String diagnosis;

        public Patient(String id, String fullName, int age, String diagnosis) {
            this.id = id;
            this.fullName = fullName;
            this.age = age;
            this.diagnosis = diagnosis;
        }

        public String getId() {
            return id;
        }

        public String getFullName() {
            return fullName;
        }

        public int getAge() {
            return age;
        }

        public String getDiagnosis() {
            return diagnosis;
        }

        public void setDiagnosis(String diagnosis) {
            this.diagnosis = diagnosis;
        }

        @Override
        public String toString() {
            return "ID: " + id +
                    " | Tên: " + fullName +
                    " | Tuổi: " + age +
                    " | Chẩn đoán: " + diagnosis;
        }
    }

    static ArrayList<Patient> patientList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void addPatient() {
        System.out.print("Nhập ID: ");
        String id = scanner.nextLine();

        if (findPatientById(id) != null) {
            System.out.println("ID đã tồn tại! Không thể thêm.");
            return;
        }

        System.out.print("Nhập họ tên: ");
        String name = scanner.nextLine();

        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập chẩn đoán: ");
        String diagnosis = scanner.nextLine();

        patientList.add(new Patient(id, name, age, diagnosis));
        System.out.println("Thêm bệnh nhân thành công!");
    }

    public static void updateDiagnosis() {
        System.out.print("Nhập ID bệnh nhân: ");
        String id = scanner.nextLine();

        Patient patient = findPatientById(id);

        if (patient == null) {
            System.out.println("Không tìm thấy bệnh nhân!");
            return;
        }

        System.out.print("Nhập chẩn đoán mới: ");
        String newDiagnosis = scanner.nextLine();
        patient.setDiagnosis(newDiagnosis);

        System.out.println("Cập nhật thành công!");
    }

    public static void dischargePatient() {
        System.out.print("Nhập ID bệnh nhân: ");
        String id = scanner.nextLine();

        Patient patient = findPatientById(id);

        if (patient == null) {
            System.out.println("Không tìm thấy bệnh nhân!");
            return;
        }

        patientList.remove(patient);
        System.out.println("Đã xuất viện thành công!");
    }

    public static void sortPatients() {

        patientList.sort(new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {

                if (p2.getAge() != p1.getAge()) {
                    return p2.getAge() - p1.getAge(); // tuổi giảm dần
                }

                return p1.getFullName().compareToIgnoreCase(p2.getFullName());
            }
        });

        System.out.println("Đã sắp xếp xong!");
    }

    public static void displayPatients() {
        if (patientList.isEmpty()) {
            System.out.println("Danh sách bệnh nhân đang trống.");
            return;
        }

        System.out.println("\n===== DANH SÁCH BỆNH NHÂN =====");
        for (Patient p : patientList) {
            System.out.println(p);
        }
    }

    public static Patient findPatientById(String id) {
        for (Patient p : patientList) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== QUẢN LÝ BỆNH NHÂN =====");
            System.out.println("1. Tiếp nhận bệnh nhân");
            System.out.println("2. Cập nhật chẩn đoán");
            System.out.println("3. Xuất viện");
            System.out.println("4. Sắp xếp danh sách");
            System.out.println("5. Hiển thị danh sách bệnh nhân");
            System.out.println("6. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    updateDiagnosis();
                    break;
                case 3:
                    dischargePatient();
                    break;
                case 4:
                    sortPatients();
                    break;
                case 5:
                    displayPatients();
                    break;
                case 6:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}