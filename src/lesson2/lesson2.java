package lesson2;

import java.util.Arrays;
import java.util.Random;

import static java.lang.System.out;

/**
 * This class keeps hold of an instance of Random and guarantees
 * that the same instance will be used over and over (so the cost
 * of re-seeding the random number generator is avoided).
 * Each time the getRandomInt() method is called, the next integer
 * from this Random instance is returned.
 */
class RandomNumbers {

    static Random random;

    private RandomNumbers() {
        random = new Random();
    }


    /**
     * Use this method to get a random integer, with a call like this:
     * int myInt = RandomNumbers.getRandomInt();
     */
    public static int getRandomInt() {
        if (random == null) new RandomNumbers();
        return random.nextInt();
    }

    /**
     * Returns a random integer x satisfying
     * lower <= x <= upper. If lower > upper, returns 0.
     *
     * @param lower
     * @param upper
     * @return
     */
    public static int getRandomInt(int lower, int upper) {
        if (lower > upper) return 0;
        if (lower == upper) return lower;
        int difference = upper - lower;
        int start = getRandomInt();

        //nonneg int in the range 0..difference - 1
        start = Math.abs(start) % (difference + 1);

        start += lower;
        return start;
    }
}

class Prog1 {
    static void print() {
        out.println(Math.pow(Math.PI, RandomNumbers.getRandomInt(1, 4)));
        out.println(Math.pow(RandomNumbers.getRandomInt(1, 4), Math.PI));
    }
}

class Prog2 {
    static void stringsplit() {
        String records = "231A,Light Bulb,123,Wilco,1.75:" +
                "113D,Hairbrush,19,Aamco,3.75:" +
                "521W,Shampoo,24,Acme,6.95:" +
                "440Q,Dishwashing Detergent,20,Wilco,1.75:" +
                "009G,Toothbrush,77,Wilco,0.85:" +
                "336C,Comb,34,Wilco,0.99:" +
                "523E,Paper Pad Set,109,Congdon and Chrome,2.45:" +
                "888A,Fake Diamond Ring,111,AmericusDiamond,3.95:" +
                "176A,Romance Nove1 1,20,Barnes and Noble,3.50:" +
                "176B,Romance Nove1 2,20,Barnes and Noble,3.50:" +
                "176C,Romance Nove1 3,20,Barnes and Noble,3.50:" +
                "500D,Floss,44,Wilco,1.25:" +
                "135B,Ant Farm,5,Wilco,8.00:" +
                "211Q,Bicycle,9,Schwinn,75.95:" +
                "932V,Pen Set,50,Congdon and Chrome,9.95:" +
                "678Q,Pencil 50,123,Congdon and Chrome,9.95:" +
                "239A,Colored Pencils,25,Congdon and Chrome,4.75:" +
                "975B,Shower Curtain,25,Wilco,6.50:" +
                "870K,Dog Bowl,15,Wilco,4.75:" +
                "231S,Cat Bowl,15,Wilco,4.75:" +
                "562M,Kitty Litter,15,Wilco,3.25:" +
                "777X,Dog Bone,15,Wilco,4.15:" +
                "933W,Cat Toy,15,Wilco,2.35:" +
                "215A,Hair Ball,0,Little Jimmy,0.00:";
        String[] t = records.split(",|:");
        for (int i = 0; i < t.length; i += 5) {
            out.println(t[i]);
        }
    }
}

class RemoveDups {
    public static String[] removeduplicate(String[] a) {

        int len = a.length;

        for (int i = 0; i < len; i++)
            for (int j = i + 1; j < len; j++)
                if (a[i] == a[j]) {
                    a[j] = a[len - 1];
                    len--;
                    j--;
                }
        String[] rd = new String[len];
        for (int i = 0; i < len; i++) {
            rd[i] = a[i];
        }
        return rd;
    }
}

class Prog4 {
    static void sum() {
        float x = 1.27f;
        float y = 3.881f;
        float z = 9.6f;
        int sum = (int) (x + y + z);
        int sum1 = Math.round(x + y + z);
        out.println(sum);
        out.println(sum1);

    }
}

class Prog5 {
    public static int[] combine(int[] a, int[] b) {
        int[] combine = new int[a.length + b.length];
        int counter = a.length;
        for (int i = 0; i < combine.length; i++) {
            if (counter > 0) {
                combine[i] = a[i];
                counter--;
            } else combine[i] = b[i - a.length];
        }


        return combine;
    }
}

class Prog6 {
    static void min(int[] ints) {
        int min = ints[0];
        for (int a : ints)
            if (a < min) min = a;
        out.println(min);
    }

}

public class lesson2 {
    public static void main(String[] args) {
        out.println("Solution for Problem – 1");
        Prog1.print();
        out.println("Solution for Problem – 2");
        Prog2.stringsplit();
        out.println("Solution for Problem – 3");
        out.println(Arrays.toString(RemoveDups.removeduplicate(new String[]{"horse", "dog", "cat", "horse", "dog"})));
        out.println("Solution for Problem – 4");
        Prog4.sum();
        out.println("Solution for Problem – 5");
        out.println(Arrays.toString(Prog5.combine(new int[]{5, 6, -4, 3, 1}, new int[]{3, 8, 9, 11})));
        out.println("Solution for Problem – 6");
        Prog6.min(new int[]{2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22});

    }
}
















