package lesson5.prob5;

public class Driver {
    public static void main(String[] args) {
        Computer[] computers = new Computer[3];
        computers[0] = new Computer("Hewlett-Packard", "Core-i7", 8, 2.4);
        computers[1] = new Computer("Hewlett-Packard", "Core-i7", 8, 2.4);
        computers[2] = new Computer("Apple", "Core-i7", 16, 3);
        for (Computer computer:computers
             ) {
            System.out.println(computer);
            System.out.println();
        }
        System.out.println(computers[1].equals(computers[0]));
        System.out.println(computers[1].equals(computers[2]));

    }
}
