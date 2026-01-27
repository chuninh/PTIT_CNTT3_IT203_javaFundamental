import java.util.Scanner;

public class btth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Bài toán: Quản lý sách (thưc viện)
        // 3 mảng tương đương id, title, quantities
        int[] ids = new int[100];
        String[] titles = new String[100];
        int[] quantities = new int[100];
        ids[0] = 1;
        titles[0] = "Lão hạc";
        quantities[0] = 10;
        int current = 1;
        // thông tin của quyển sách sẽ cùng vị trí (index)
        // Thực hiện các chức năng:
        /**
         * 1. Hiển thị danh sách
         * 2. Thêm mới (vào cuối)
         * 3. Cập nhật
         * 4. Xoá sách
         * 5. Tìm kiếm
         * 6. Sắp xếp theo số lượng giảm dần
         * 7. Thoát
         * */
        /**
         * do while
         * */
        do {
            System.out.println("""
                         1. Hiển thị danh sách
                         2. Thêm mới (vào cuối)
                         3. Cập nhật
                         4. Xoá sách
                         5. Tìm kiếm
                         6. Sắp xếp theo số lượng giảm dần
                         7. Thoát
                         Lựa chọn của bạn: 
                    """);
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    // Mảng ko có thì phải thông báo rỗng
                    if (current == 0) {
                        System.err.println("Danh sách rỗng...");
                    } else {
                        // Nếu có thì in ra
                        for (int i = 0; i < current; i++) {
                            System.out.println("--------------------------------------");
                            System.out.println("id = " + ids[i]);
                            System.out.println("title = " + titles[i]);
                            System.out.println("quantity = " + quantities[i]);
                            System.out.println("--------------------------------------");
                        }
                    }
                    break;
                case 2:
                    // Nhập số lượng muốn thêm:
                    System.out.println("Nhập số lượng sách muốn thêm: ");
                    int n = Integer.parseInt(sc.nextLine());
                    // Dùng vòng for để thiết lập nhập nhiều lần
                    for (int i = 0; i < n; i++) {

                        int newId = inputId(ids, sc, current);
                        // Kiểm tra tồn tại của id;
                        System.out.println("Nhập title: ");
                        String newTitle = sc.nextLine();
                        System.out.println("Nhập quantity: ");
                        int newQuantity = Integer.parseInt(sc.nextLine());
                        ids[current] = newId;
                        titles[current] = newTitle;
                        quantities[current] = newQuantity;
                        current++;
                    }
                    // Nhập id, title, quantity
                    // Kiểm tra id (tồn tại hay chưa), title (không được bỏ trống), quantity (>0)
                    // Thêm vào mảng
                    // current tăng lên
                    break;
                case 3:
                    /**
                     * CHỨC NĂNG SỬA THÔNG TIN
                     * Nhập id cần sửa:
                     * Kiểm tra xem tồn tại hay không (duyệt qua và tìm index)
                     * Cho nhập lại thông tin (title, quantities);
                     * sử dụng phép gán
                     * */
                    break;
                case 4:
                    /**
                     * CHỨC NĂNG XOÁ THÔNG TIN
                     * B1: Nhập id cần xoá
                     * B2: Tìm vị trí index cần xoá dựa vào id (duyệt for)
                     * B3: Dịch chuyển từ phải qua trái 3 mảng
                     * B4: Thông báo xoá thành công
                     * */
                    break;
                case 5:
                    break;
                case 6:
                    /**
                     * SẮP XẾP (Bubble sort) - duyệt qua mảng quantities sắp xếp theo số lượng
                     * - sử dụng 2 vòng for
                     * - so sánh 2 cặp liền kề nhau
                     * - cái nào nhỏ hơn đẩy ra đằng sau
                     * - nhớ phải đảo cả 3 mảng (ids, titles, quantities)
                     * */
                    break;
                case 7:
                    break;
                default:
                    System.err.println("Vui lòng nhập lại từ 1 -> 7");
            }
        } while (true);
    }

    public static int inputId(int[] ids, Scanner sc, int current) {

        System.out.println("Nhập id: ");
        do {
            boolean isExist = false;
            int newId = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < current; i++) {
                if (ids[i] == newId) {
                    isExist = true;
                    break;
                }
            }
            if (isExist) {
                System.err.println("Đã bị trùng, Vui lòng nhập lại: ");
            } else {
                return newId;
            }
        } while (true);
    }

}

