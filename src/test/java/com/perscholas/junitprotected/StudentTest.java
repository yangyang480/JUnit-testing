package com.perscholas.junitprotected;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class StudentTest {

        @Test
        public void testStudent() {
            Student a = new Student();
            a.setId(1);
            a.setEmail("mgabriel@perscholas.org");
            a.setLastname("Mike");
            a.setFirstname("Gabriel");

            Student b = new Student();
            b.setId(1);
            b.setEmail("mgabriel@perscholas.org");
            b.setLastname("Mike");
            b.setFirstname("Gabriel");

            assertEquals(a, b);
        }

    @Test
    public void testNumberFormatException() {
        assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("Five");
        });
    }



}

