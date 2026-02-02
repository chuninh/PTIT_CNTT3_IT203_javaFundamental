package ss7;
class Student1 {
    private String studentId;
    private String studentName;

    static int totalStudent = 0;

    Student1(String studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
        totalStudent++;
    }

    void displayInfo() {
        System.out.println("Ma SV: " + studentId);
        System.out.println("Ten SV: " + studentName);
        System.out.println("----------------------");
    }

    static void displayTotalStudent() {
        System.out.println("Tong so sinh vien da tao: " + totalStudent);
    }
}

public class bai1 {
    public static void main(String[] args) {

        Student1 sv1 = new Student1("SV001", "Nguyen Van A");
        Student1 sv2 = new Student1("SV002", "Tran Thi B");
        Student1 sv3 = new Student1("SV003", "Le Van C");

        sv1.displayInfo();
        sv2.displayInfo();
        sv3.displayInfo();

        Student1.displayTotalStudent();
    }
}
