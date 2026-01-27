package ss3;

public class bai6 {

    // Phương thức gộp 2 mảng và loại trùng
    public static int[] mergeBooks(int[] arrayFirst, int[] arraySecond) {

        int[] temp = new int[arrayFirst.length + arraySecond.length];

        int i = 0, j = 0, k = 0;

        while (i < arrayFirst.length && j < arraySecond.length) {
            if (arrayFirst[i] < arraySecond[j]) {
                temp[k++] = arrayFirst[i++];
            } else if (arrayFirst[i] > arraySecond[j]) {
                temp[k++] = arraySecond[j++];
            } else {
                temp[k++] = arrayFirst[i];
                i++;
                j++;
            }
        }

        while (i < arrayFirst.length) {
            temp[k++] = arrayFirst[i++];
        }

        while (j < arraySecond.length) {
            temp[k++] = arraySecond[j++];
        }

        // Tạo mảng kết quả đúng kích thước
        int[] arrayMerge = new int[k];
        for (int x = 0; x < k; x++) {
            arrayMerge[x] = temp[x];
        }

        return arrayMerge;
    }

    // Phương thức hiển thị mảng
    public static void displayArray(int[] arr) {
        System.out.println("Danh sách sách sau khi gộp:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arrayFirst  = {1, 3, 5, 7, 9};
        int[] arraySecond = {2, 3, 5, 6, 8, 10};

        int[] arrayMerge = mergeBooks(arrayFirst, arraySecond);
        displayArray(arrayMerge);
    }
}
