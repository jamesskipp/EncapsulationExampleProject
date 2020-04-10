package com.company;

import java.util.Random;

public class PersonV2 {

    /**
     * With SSN, we want consumers (like people using this class in their code)
     * to be able to see a person's SSN, but not to set it. We want to set the SSN
     * randomly when a person is created, and not allow others to modify it.
     *
     * OOP through encapsulation allows us to do this. Other languages which do not have
     * OOP features cannot prevent consumers from modifying properties of data.
     */
    private Integer ssn;

    public Integer getSsn() {
        return ssn;
    }

    // Note: No setter for SSN

    /**
     * Also note: Instead of preventing the user from modifying the ssn property by not
     * providing a setter, we could provide a setter that checks the given value before
     * setting it and verifying that the given value is a valid SSN. This would allow us
     * to at least prevent bad values from being set.
     */

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * No arg constructor, give the person any name you want, but we set the ssn
     * when the user is created (objects are created when you call the constructor
     * with the "new" keyword)
     */
    PersonV2() {
        this.ssn = new Random().nextInt(999999999);
    }

    /**
     * Again, you probably want to add properties that can freely be set as args
     * in a constructor. But this way, or the above way works. And you can give
     * consumers both.
     *
     * @param name String
     */
    PersonV2(String name) {
        this.name = name;
        this.ssn = new Random().nextInt(999999999);
    }

    /* ... (other best practice methods like toString, hashCode, equals, all args constructor ) */
}
