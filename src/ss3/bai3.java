package ss3;

import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {

        String[] names = {
                "Lap trinh Java",
                "Cau truc du lieu",
                "Co so du lieu",
                "Lap trinh Python",
                "He dieu hanh"
        };

        int[] quantities = {10, 5, 10, 3, 3};

        int max = quantities[0];
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] > max) {
                max = quantities[i];
            }
        }

        System.out.println("Sách có số lượng nhiều nhất:");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == max) {
                System.out.println("- " + names[i] + ": " + quantities[i]);
            }
        }

        int min = quantities[0];
        for (int i = 1; i < quantities.length; i++) {
            if (quantities[i] < min) {
                min = quantities[i];
            }
        }

        System.out.println("Sách có số lượng ít nhất:");
        for (int i = 0; i < quantities.length; i++) {
            if (quantities[i] == min) {
                System.out.println("- " + names[i] + ": " + quantities[i]);
            }
        }
    }
}
