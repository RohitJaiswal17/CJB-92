package Practise.iterativestatements.foreachloops;

import java.util.ArrayList;
import java.util.List;

public class PrintListItems {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Emily");

        System.out.println("List of names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
