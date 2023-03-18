package org.example;

import java.util.*;

/**
 * the main class where methods are called and run
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /**
         * treeSet suite with adding a person, iterate trough the treeSet;
         */
        TreeSet<Person> people = new TreeSet<>(new PersonNameSorter());
        System.out.println("Sorting in ascending order of names");
        people.add(new Person("Dumtiru", 35));
        people.add(new Person("Alexandra", 33));
        people.add(new Person("Alexandru", 4));
        people.add(new Person("Cristina", 62));
        Iterator<Person> iterator = people.iterator();
        System.out.println("TreeSet: ");
        while (iterator.hasNext())
            System.out.println(iterator.next() + ",");

        System.out.println();
//    for(Person person : people) {
//        System.out.println(person);
//    }

        System.out.println("Sorting in descending order of age");

        TreeSet<Person> peopleAge = new TreeSet<>(new PersonAgeSorter());
        peopleAge.add(new Person("Dumitru", 35));
        peopleAge.add(new Person("Alexandra", 33));
        peopleAge.add(new Person("Alexandru", 4));
        peopleAge.add(new Person("Cristina", 62));

        for (Person person : peopleAge) {
            System.out.println(person);
        }
        List<Hobby> hobbies = new ArrayList<>();
        Hobby cycling = new Hobby("cycling", 7);
        Hobby swimming = new Hobby("swimming", 3);
        Hobby chess = new Hobby("chess", 14);
        hobbies.add(cycling);
        hobbies.add(swimming);
        hobbies.add(chess);
        Address address = new Address("Romania", "Iasi");
        Address address1 = new Address("Grecia", "Abdera");
        Address address2 = new Address("Franta", "Paris");

        cycling.addAddress(address);
        swimming.addAddress(address1);
        chess.addAddress(address2);
        System.out.println(hobbies);

        HashMap <Person, List<Hobby>> personHobbies = new HashMap<>();
        Person Dumitru = new Person("Dumitru", 35);
        Person Alexandra = new Person("Alexandra", 33);
        personHobbies.put(Dumitru, (List<Hobby>) cycling);
        personHobbies.put(Alexandra, (List<Hobby>) swimming);

    }
}
