package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("START EXAMPLE");

        /*** Example 1 ***/
        PersonV1 jamesV1 = new PersonV1();

        jamesV1.setName("James");

        String jamesName = jamesV1.getName();

        assert "James".equals(jamesName);

        /*** Example 2  ***/
        PersonV2 jamesV2 = new PersonV2("James");

//        james.setSsn(111111111); // Error: Cannot resolve method setSsn

        // Lets see what our class set the SSN to
        System.out.println(jamesV2.getSsn());

        /*** Example 3  ***/
        PersonV3 jamesV3 = new PersonV3("James");
        Integer nameLength = jamesV3.getNameLength();
        assert nameLength == 3;

        /*** Example 4  ***/
        PersonV4 jamesV4 = new PersonV4("James");
        String jamesV4Name = jamesV4.getName();
        assert "James".equals(jamesV4Name);
        assert jamesV4.getNameLength() == 5;
        assert jamesV4.getNumTimesNameViewed() == 1;
        jamesV4.getName();
        assert jamesV4.getNumTimesNameViewed() == 2;

        System.out.println("EXAMPLE FINISHED");
    }
}
