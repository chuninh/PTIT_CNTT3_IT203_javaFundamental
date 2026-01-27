package ss3;

import java.util.Scanner;
public class bai6 {
    public static void main(String[] args) {

        int[] arrayFirst  = {1, 3, 5, 7, 9};
        int[] arraySecond = {2, 3, 5, 6, 10};

        int[] temp = new int[arrayFirst.length + arraySecond.length];

        int i = 0;
        int j = 0;
        int k = 0;

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


        int[] arrayMerge = new int[k];
        for (int x = 0; x < k; x++) {
            arrayMerge[x] = temp[x];
        }

        System.out.println("Danh sách sách sau khi gộp:");
        for (int x = 0; x < arrayMerge.length; x++) {
            System.out.print(arrayMerge[x] + " ");
        }
    }
}
