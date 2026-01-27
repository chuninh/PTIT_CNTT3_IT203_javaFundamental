package ss3;

public class bai4 {

    public static void sortBooks(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void displayBooks(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] isbnBooks = {105, 23, 89, 12, 77, 45};

        System.out.println("Mảng trước khi sắp xếp:");
        displayBooks(isbnBooks);

        sortBooks(isbnBooks);

        System.out.println("Mảng sau khi sắp xếp tăng dần:");
        displayBooks(isbnBooks);
    }
}
