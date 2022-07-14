package learn.java;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {15, 7, 54, 9, 53, 345, 87, 22};
        int target = 345;
        System.out.println(search(arr, target, 0, arr.length - 1));
    }

    public static int search(int[] arr, int target, int s, int e) {

        if(s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;
        if(arr[m] == target) {
            return m;
        }
        if(target < arr[m]) {
            return search(arr, target, s, m - 1);
        }

        return search(arr, target, m + 1, e);

    }
}
