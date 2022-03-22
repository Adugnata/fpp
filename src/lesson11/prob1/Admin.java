package lesson11.prob1;
import java.util.*;

public class Admin {
    public static Hashtable<Key, Student> processStudents(List<Student> students) {
        Hashtable<Key, Student> studentHashMap = new Hashtable<>();
        for (Student s : students) {
            studentHashMap.put(new Key(s.getFirstName(), s.getLastName()), s);
        }
        return studentHashMap;
    }
    public static double computeAverageGPA(Hashtable<Key, Student> maps) {
        double sum = 0;
        for (Student s : maps.values())
            sum += s.getGpa();
        return sum / maps.size();
    }
}
