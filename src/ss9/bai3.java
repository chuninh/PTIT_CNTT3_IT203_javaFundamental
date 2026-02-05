package ss9;

public class bai3 {
    public static void main(String[] args) {
        Manager m = new Manager("Nguyễn Văn A", 8000000, "IT");
        m.hienThiThongTin();
    }
}

class Employee {
    protected String ten;
    protected double luongCoBan;

    public Employee(String ten, double luongCoBan) {
        this.ten = ten;
        this.luongCoBan = luongCoBan;
    }

    public void hienThiThongTin() {
        System.out.println("Tên: " + ten);
        System.out.println("Lương cơ bản: " + luongCoBan);
    }
}

class Manager extends Employee {
    private String phongBan;

    public Manager(String ten, double luongCoBan, String phongBan) {
        super(ten, luongCoBan);
        this.phongBan = phongBan;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Phòng ban: " + phongBan);
    }
}
