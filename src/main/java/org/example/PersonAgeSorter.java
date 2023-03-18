package org.example;

import java.util.Comparator;

/**
 * sorting in descending order of age
 */
public class PersonAgeSorter implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.age > o2.age) {
            return -1;
        } else if (o1.age < o2.age) {
            return 1;
        } else {
            return (o1.age).compareTo(o2.age);
        }

    }
}
