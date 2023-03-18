package org.example;

import java.util.Comparator;

/**
 * sorting in ascending order of name
 */
public class PersonNameSorter implements Comparator<Person> {
    @Override
    public int compare(Person o1 , Person o2) {
        return o1.name.compareTo(o2.name);
    }
}
