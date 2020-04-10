package com.company;

public class PersonV1 {

    /* name is how 95% of your properties should look. It is considered best practice to encapsulate properties
     * with getters and setters despite the fact that effectively, this is the same as making the property public */

    /**
     * Private property, we have encapsulated it by making it
     * private and exposing access to it through a getter and setter
     */
    private String name;

    /**
     * Allows us to control whether or not the user can view the private
     * property, and how.
     *
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     * Also allows us to control whether or not the user can change value
     *
     * @param name String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * No args constructor would be useful if you want consumers of your
     * class to call setters to add values, or in another case you have some
     * default values you can add to make this useful.
     */
    PersonV1() {

    }

    /* ... (other best practice methods like toString, hashCode, equals, all args constructor ) */
}
