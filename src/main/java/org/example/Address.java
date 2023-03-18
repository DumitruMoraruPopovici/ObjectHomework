package org.example;

/**
 * blueprint for address with the constructor
 */
public class Address {
    String county;
    String country;

    /**
     * constructor for Address
     * @param country
     * @param county
     */
    public Address (String country, String county) {
        this.country = country;
        this.county = county;

    }

}
