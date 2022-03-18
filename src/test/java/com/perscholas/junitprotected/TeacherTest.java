package com.perscholas.junitprotected;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeacherTest {
    @Test
    public void testTeacher() {
        Teacher a = new Teacher();
        a.setId(1);
        a.setEmail("mgabriel@perscholas.org");
        a.setfName("Mike");
        a.setlName("Gabriel");

        Teacher b = new Teacher();
        b.setId(1);
        b.setEmail("mgabriel@perscholas.org");
        b.setfName("Mike");
        b.setlName("Gabriel");

        assertEquals(a, b);
    }

}
