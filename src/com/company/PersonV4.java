package com.company;

import java.util.Random;

public class PersonV4 {

    /**
     * This is another read-only property
     */
    private Integer numTimesNameViewed;

    public Integer getNumTimesNameViewed() {
        return this.numTimesNameViewed;
    }

    public Integer getNameLength() {
        if (this.name != null) {
            return this.name.length();
        } else {
            return 0;
        }
    }

    private Integer ssn;

    public Integer getSsn() {
        return ssn;
    }

    private String name;

    /**
     * Notice now our encapsulation of the name property allows us to call some
     * other unrelated code whenever a user checks the value of a user's name
     *
     * @return String the user's name
     */
    public String getName() {
        this.numTimesNameViewed++;
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    PersonV4() {
        this.numTimesNameViewed = 0;
        this.ssn = new Random().nextInt(999999999);
    }

    PersonV4(String name) {
        this.name = name;
        this.numTimesNameViewed = 0;
        this.ssn = new Random().nextInt(999999999);
    }

    /* ... (other best practice methods like toString, hashCode, equals, all args constructor ) */
}
