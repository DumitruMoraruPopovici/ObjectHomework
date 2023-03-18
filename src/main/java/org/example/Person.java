package org.example;

import java.util.Objects;

/**
 * blueprint for person with properties and behaviors
 */
public class Person {


        String name;

        Integer age;



    /**
     *constructor for person
     */
        public Person (String name, int age) {
            this.name = name;
            this.age = age;
        }

    /**
     * toString method for printing
     */
    @Override
        public String toString() {
            return "Person{" +
                    "name='" + this.name + '\'' +
                    ", age=" + this.age +
                    '}';
        }

    /**
     * equal and hashcode methods
     */
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person person)) return false;

            if (!Objects.equals(name, person.name)) return false;
            return Objects.equals(age, person.age);
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (age != null ? age.hashCode() : 0);
            return result;
        }
}
