package lesson12;

import java.util.Hashtable;
import java.util.Map;
import java.util.Stack;

public class Finally{
    public static void main(String[] args) {
        Stack<String> q = new Stack<>();
        q.add("Android");
        q.add("DotNet");
        q.add("Php");
        q.add("html");
        System.out.println(q.search("html"));
    }
}