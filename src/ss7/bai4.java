package ss7;

class ClassRoom {
    static double classFund = 0;
    private String studentName;
    ClassRoom(String studentName) {
        this.studentName = studentName;
    }

    void contribute(double amount) {
        if (amount > 0) {
            classFund += amount;
            System.out.println(studentName + " da dong " + amount);
        } else {
            System.out.println("So tien dong khong hop le!");
        }
    }

    static void showClassFund() {
        System.out.println("Tong quy lop: " + classFund);
        System.out.println("----------------------");
    }
}

public class bai4 {
    public static void main(String[] args) {

        ClassRoom sv1 = new ClassRoom("Nguyen Van A");
        ClassRoom sv2 = new ClassRoom("Tran Thi B");
        ClassRoom sv3 = new ClassRoom("Le Van C");

        sv1.contribute(100);
        sv2.contribute(150);
        sv3.contribute(200);

        ClassRoom.showClassFund();
    }
}
