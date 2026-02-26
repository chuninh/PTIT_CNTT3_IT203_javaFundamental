package ss12;

import java.util.ArrayList;
import java.util.List;

public class bai3 {

    public static <T> List<T> findCommonPatients(List<T> listA, List<T> listB) {

        List<T> result = new ArrayList<>();

        for (T element : listA) {
            if (listB.contains(element) && !result.contains(element)) {
                result.add(element);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        List<Integer> noiKhoaIDs = new ArrayList<>();
        noiKhoaIDs.add(101);
        noiKhoaIDs.add(102);
        noiKhoaIDs.add(105);

        List<Integer> ngoaiKhoaIDs = new ArrayList<>();
        ngoaiKhoaIDs.add(102);
        ngoaiKhoaIDs.add(105);
        ngoaiKhoaIDs.add(108);

        List<Integer> commonIDs = findCommonPatients(noiKhoaIDs, ngoaiKhoaIDs);
        System.out.println("Test Case 1 Output: " + commonIDs);


        List<String> noiKhoaBHYT = new ArrayList<>();
        noiKhoaBHYT.add("DN01");
        noiKhoaBHYT.add("DN02");
        noiKhoaBHYT.add("DN03");

        List<String> ngoaiKhoaBHYT = new ArrayList<>();
        ngoaiKhoaBHYT.add("DN02");
        ngoaiKhoaBHYT.add("DN04");

        List<String> commonBHYT = findCommonPatients(noiKhoaBHYT, ngoaiKhoaBHYT);
        System.out.println("Test Case 2 Output: " + commonBHYT);
    }
}
