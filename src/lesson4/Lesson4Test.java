package lesson4;

import org.junit.Test;

import static org.junit.Assert.*;

class Lesson4 {
    static double power(double x, int n) {
        if (n == 0)
            return 1;
        else
            return x * power(x, n - 1);
    }

    public int binarySearch(int[] items, int target) {
        return binarySearch(items, target, 0, items.length - 1);
    }

    private int binarySearch(int[] data, int target, int low, int high) {
        if (low > high)
            return -1;
        else {
            int mid = (low + high) / 2;
            if (target == data[mid])
                return mid;
            else if (target < data[mid])
                return binarySearch(data, target, low, mid - 1);
            else
                return binarySearch(data, target, mid + 1, high);
        }
    }

    public Character findMinChar(String a) {
        return findMinChar(a, a.length());
    }

    private Character findMinChar(String a, int n) {
        if (n == 0) return null;
        else if (n == 1)
            return a.charAt(0);
        return min(a.charAt(0), findMinChar(a.substring(1), n - 1));
    }

    static char min(char a, char b) {
        return (a < b) ? a : b;
    }

}

public class Lesson4Test {

    @Test
    public void power() {
        Lesson4 l4 = new Lesson4();
        double p1 = l4.power(2, 3);
        double p2 = 8;
        assertEquals(p1, p2, 0);
    }

    @Test
    public void binarySearch() {
        Lesson4 l4 = new Lesson4();
        int bs1 = l4.binarySearch(new int[]{1, 2, 3, 4, 5, 42}, 42);
        int bs2 = 5;
        assertEquals(bs1, bs2);

    }

    @Test
    public void findMinChar() {
        Lesson4 l4 = new Lesson4();
        int min1 = l4.findMinChar("tesfamichael");
        int min2 = 'a';
        assertEquals(min1, min2);

    }

}
