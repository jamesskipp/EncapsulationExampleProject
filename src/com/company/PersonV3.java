package com.company;

import java.util.Random;

public class PersonV3 {

    /**
     * Another example of a getter showing encapsulation. We don't actually
     * have a property "nameLength" but have a getter that returns a dynamic
     * value "nameLength". Encapsulation says that the consumer does not need
     * to know the underlying logic/innerworking of your class, and you can
     * control how they interact with it.
     *
     * @return Integer the length of the name property
     */
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    PersonV3() {
        this.ssn = new Random().nextInt(999999999);
    }

    PersonV3(String name) {
        this.name = name;
        this.ssn = new Random().nextInt(999999999);
    }

    /* ... (other best practice methods like toString, hashCode, equals, all args constructor ) */
}
