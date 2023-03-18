package org.example;


import java.util.ArrayList;
import java.util.List;
/**
 * blueprint class for Hobby
 */
public class Hobby {
    String hobbyName;
    int frequency;
    List<Address> listOfAddress = new ArrayList<>();


    /**
     * \method for adding adresses to the hobbies
     * @param address
     */

    public void addAddress(Address address) {
        listOfAddress.add(address);
    }

    /**
     * constructor for Hobby
     * @param hobbyName
     * @param frequency
     */
    public Hobby(String hobbyName, int frequency) {
        this.hobbyName = hobbyName;
        this.frequency = frequency;
    }


    /**
     * Print method for Hobby(overriden)
     * @return
     */

    @Override
    public String toString() {
        return "Hobby{" +
                "hobbyName='" + this.hobbyName + '\'' +
                ", frequency=" + this.frequency +
                '}';
    }
}
