package ss8;

import java.util.Scanner;

public class btth {
    static class Student {
        private String maSV;
        private String hoTen;
        private int tuoi;
        private String gioiTinh;
        private double diemToan;
        private double diemLy;
        private double diemHoa;
        private double diemTrungBinh;
        private String xepLoai;

        public Student(String maSV, String hoTen, int tuoi, String gioiTinh,
                       double diemToan, double diemLy, double diemHoa) {
            this.maSV = maSV;
            this.hoTen = hoTen;
            this.tuoi = tuoi;
            this.gioiTinh = gioiTinh;
            this.diemToan = diemToan;
            this.diemLy = diemLy;
            this.diemHoa = diemHoa;
            tinhDiemTrungBinh();
            xepLoaiHocLuc();
        }

        public void tinhDiemTrungBinh() {
            diemTrungBinh = (diemToan + diemLy + diemHoa) / 3;
        }

        public void xepLoaiHocLuc() {
            if (diemTrungBinh >= 8.0) {
                xepLoai = "Gioi";
            } else if (diemTrungBinh >= 6.5) {
                xepLoai = "Kha";
            } else if (diemTrungBinh >= 5.0) {
                xepLoai = "Trung binh";
            } else {
                xepLoai = "Yeu";
            }
        }

        public String getMaSV() {
            return maSV;
        }

        public double getDiemTrungBinh() {
            return diemTrungBinh;
        }

        public String getXepLoai() {
            return xepLoai;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public void setDiem(double toan, double ly, double hoa) {
            this.diemToan = toan;
            this.diemLy = ly;
            this.diemHoa = hoa;
            tinhDiemTrungBinh();
            xepLoaiHocLuc();
        }

        public void hienThi() {
            System.out.printf(
                    "%-10s %-20s %-5d %-6s %-5.2f %-5.2f %-5.2f %-5.2f %-12s\n",
                    maSV, hoTen, tuoi, gioiTinh,
                    diemToan, diemLy, diemHoa, diemTrungBinh, xepLoai
            );
        }
    }

    static Scanner sc = new Scanner(System.in);
    static Student[] danhSach = new Student[100];
    static int soLuong = 0;

    public static void main(String[] args) {
        int chon;
        do {
            menu();
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1: themSinhVien(); break;      // FR1
                case 2: hienThiDanhSach(); break;   // FR2
                case 3: timKiemSinhVien(); break;   // FR3
                case 4: capNhatSinhVien(); break;   // FR4
                case 5: sapXep(); break;            // FR7
                case 6: thongKe(); break;           // FR8
                case 0: System.out.println("Thoat chuong trinh"); break;
                default: System.out.println("Lua chon sai");
            }
        } while (chon != 0);
    }

    static void menu() {
        System.out.println("\n===== QUAN LY SINH VIEN =====");
        System.out.println("1. Them sinh vien");
        System.out.println("2. Hien thi danh sach");
        System.out.println("3. Tim kiem sinh vien");
        System.out.println("4. Cap nhat sinh vien");
        System.out.println("5. Sap xep theo DTB");
        System.out.println("6. Thong ke");
        System.out.println("0. Thoat");
        System.out.print("Chon: ");
    }


    static void themSinhVien() {
        System.out.print("Ma SV: ");
        String ma = sc.nextLine();

        for (int i = 0; i < soLuong; i++) {
            if (danhSach[i].getMaSV().equals(ma)) {
                System.out.println("Trung ma SV");
                return;
            }
        }

        System.out.print("Ho ten: ");
        String ten = sc.nextLine();

        System.out.print("Tuoi: ");
        int tuoi = Integer.parseInt(sc.nextLine());
        if (tuoi < 18 || tuoi > 30) {
            System.out.println("Tuoi khong hop le");
            return;
        }

        System.out.print("Gioi tinh: ");
        String gt = sc.nextLine();

        System.out.print("Diem Toan: ");
        double toan = Double.parseDouble(sc.nextLine());
        System.out.print("Diem Ly: ");
        double ly = Double.parseDouble(sc.nextLine());
        System.out.print("Diem Hoa: ");
        double hoa = Double.parseDouble(sc.nextLine());

        if (!hopLe(toan) || !hopLe(ly) || !hopLe(hoa)) {
            System.out.println("Diem khong hop le");
            return;
        }

        danhSach[soLuong++] = new Student(ma, ten, tuoi, gt, toan, ly, hoa);
        System.out.println("Them thanh cong");
    }

    static void hienThiDanhSach() {
        if (soLuong == 0) {
            System.out.println("Danh sach rong");
            return;
        }
        System.out.printf("%-10s %-20s %-5s %-6s %-5s %-5s %-5s %-5s %-12s\n",
                "MaSV","HoTen","Tuoi","GT","Toan","Ly","Hoa","DTB","XepLoai");
        for (int i = 0; i < soLuong; i++) {
            danhSach[i].hienThi();
        }
    }

    static void timKiemSinhVien() {
        System.out.print("Nhap ma SV can tim: ");
        String ma = sc.nextLine();
        for (int i = 0; i < soLuong; i++) {
            if (danhSach[i].getMaSV().equals(ma)) {
                danhSach[i].hienThi();
                return;
            }
        }
        System.out.println("Khong tim thay");
    }

    static void capNhatSinhVien() {
        System.out.print("Nhap ma SV can sua: ");
        String ma = sc.nextLine();
        for (int i = 0; i < soLuong; i++) {
            if (danhSach[i].getMaSV().equals(ma)) {
                System.out.print("Ten moi: ");
                danhSach[i].setHoTen(sc.nextLine());

                System.out.print("Diem Toan moi: ");
                double t = Double.parseDouble(sc.nextLine());
                System.out.print("Diem Ly moi: ");
                double l = Double.parseDouble(sc.nextLine());
                System.out.print("Diem Hoa moi: ");
                double h = Double.parseDouble(sc.nextLine());

                danhSach[i].setDiem(t, l, h);
                System.out.println("Cap nhat thanh cong");
                return;
            }
        }
        System.out.println("Khong tim thay");
    }

    static void sapXep() {
        for (int i = 0; i < soLuong - 1; i++) {
            for (int j = i + 1; j < soLuong; j++) {
                if (danhSach[i].getDiemTrungBinh() < danhSach[j].getDiemTrungBinh()) {
                    Student temp = danhSach[i];
                    danhSach[i] = danhSach[j];
                    danhSach[j] = temp;
                }
            }
        }
        System.out.println("Da sap xep theo DTB giam dan");
    }
    static void thongKe() {
        if (soLuong == 0) {
            System.out.println("Danh sach rong, khong the thong ke");
            return;
        }

        int gioi = 0, kha = 0, tb = 0, yeu = 0;
        double max = danhSach[0].getDiemTrungBinh();

        for (int i = 0; i < soLuong; i++) {
            switch (danhSach[i].getXepLoai()) {
                case "Gioi": gioi++; break;
                case "Kha": kha++; break;
                case "Trung binh": tb++; break;
                case "Yeu": yeu++; break;
            }
            if (danhSach[i].getDiemTrungBinh() > max) {
                max = danhSach[i].getDiemTrungBinh();
            }
        }

        System.out.println("Gioi: " + gioi);
        System.out.println("Kha: " + kha);
        System.out.println("Trung binh: " + tb);
        System.out.println("Yeu: " + yeu);
        System.out.println("DTB cao nhat: " + max);
    }

    static boolean hopLe(double d) {
        return d >= 0 && d <= 10;
    }
}
