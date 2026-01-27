package ss3;

import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {

        int[] isbnBooks = {105, 23, 89, 12, 77, 45};

        System.out.println("Mảng trước khi sắp xếp:");
        for (int i = 0; i < isbnBooks.length; i++) {
            System.out.print(isbnBooks[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < isbnBooks.length - 1; i++) {
            for (int j = 0; j < isbnBooks.length - 1 - i; j++) {
                if (isbnBooks[j] > isbnBooks[j + 1]) {
                    int temp = isbnBooks[j];
                    isbnBooks[j] = isbnBooks[j + 1];
                    isbnBooks[j + 1] = temp;
                }
            }
        }

        System.out.println("Mảng sau khi sắp xếp tăng dần:");
        for (int i = 0; i < isbnBooks.length; i++) {
            System.out.print(isbnBooks[i] + " ");
        }
    }
}
