package com.java.jdbc;



import static org.junit.Assert.*;



import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.sql.Date;



import org.junit.Test;



import com.java.jdbc.model.Employee;



public class EmployeeTest {



    @Test

    public void testDefaultConstructor() {

        Employee emp = new Employee();

        assertNotNull(emp);

    }



    @Test

    public void testParameterizedConstructor() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Employee emp1 = new Employee(1, "Allan", "Thomas", "Male", "allanthomas@gmail.com", "9955993399",

                "Guindy", "SWE", Date.valueOf("2000-10-10"), Date.valueOf("2024-05-01"),

                Date.valueOf("2055-10-10"));
        assertNotNull(emp1);

    }



    @Test

    public void testGettersSetters() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Employee employee = new Employee();

        employee.setEmployeeID(1);

        employee.setFirstName("Allan");

        employee.setLastName("Thomas");

        employee.setGender("Male");

        employee.setEmail("allanthomas@gmail.com");

        employee.setPhoneNumber("9955993399");

        employee.setAddress("Guindy");

        employee.setPosition("SWE");

        employee.setDob(Date.valueOf("2000-10-10"));

        employee.setJoiningDate(Date.valueOf("2024-05-01"));

        employee.setTerminationDate(Date.valueOf("2055-10-10"));



        assertEquals(1, employee.getEmployeeID());

        assertEquals("Allan", employee.getFirstName());

        assertEquals("Thomas", employee.getLastName());

        assertEquals("Male", employee.getGender());

        assertEquals("allanthomas@gmail.com", employee.getEmail());

        assertEquals("9955993399", employee.getPhoneNumber());

        assertEquals("Guindy", employee.getAddress());

        assertEquals("SWE", employee.getPosition());

        assertEquals(Date.valueOf("2000-10-10"), employee.getDob());

        assertEquals(Date.valueOf("2024-05-01"), employee.getJoiningDate());

        assertEquals(Date.valueOf("2055-10-10"), employee.getTerminationDate());

    }



    @Test

    public void testHashCode() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Employee emp1 = new Employee(1, "Allan", "Thomas", "Male", "allanthomas@gmail.com", "9955993399",

                "Guindy", "SWE", Date.valueOf("2000-10-10"), Date.valueOf("2024-05-01"),

                Date.valueOf("2055-10-10"));

        Employee emp2 = new Employee(1, "Allan", "Thomas", "Male", "allanthomas@gmail.com", "9955993399",

                "Guindy", "SWE", Date.valueOf("2000-10-10"), Date.valueOf("2024-05-01"),

                Date.valueOf("2055-10-10"));



        assertEquals(emp1.hashCode(), emp2.hashCode());

    }



    @Test

    public void testEquals() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Employee emp1 = new Employee(1, "Allan", "Thomas", "Male", "allanthomas@gmail.com", "9955993399",

                                     "Guindy", "SWE", Date.valueOf("2000-10-10"), Date.valueOf("2024-05-01"),

                                     Date.valueOf("2055-10-10"));
        Employee emp2 = new Employee(1, "Allan", "Thomas", "Male", "allanthomas@gmail.com", "9955993399",

                "Guindy", "SWE", Date.valueOf("2000-10-10"), Date.valueOf("2024-05-01"),

                Date.valueOf("2055-10-10"));
        Employee emp3 = new Employee(2, "Allan", "Thomas", "Male", "allanthomas@gmail.com", "9955993399",

                "Guindy", "SWE", Date.valueOf("2000-10-10"), Date.valueOf("2024-05-01"),

                Date.valueOf("2055-10-10"));

       



        assertTrue(emp1.equals(emp2));

        assertFalse(emp1.equals(emp3));
        assertTrue(emp1.equals(emp2));
        assertTrue(emp2.equals(emp1));
        assertTrue(emp1.equals(emp1));
        assertFalse(emp1.equals(emp3));
        assertFalse(emp2.equals(emp3));
        assertFalse(emp1.equals(null));
        assertFalse(emp1.equals("Some String"));
        

    }



    @Test

    public void testToString() throws ParseException {SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    Employee emp1 = new Employee(1, "Allan", "Thomas", "Male", "allanthomas@gmail.com", "9955993399",

            "Guindy", "SWE", Date.valueOf("2000-10-10"), Date.valueOf("2024-05-01"),

            Date.valueOf("2055-10-10"));



    String expected = "Employee [EmployeeID=1, FirstName=Allan, LastName=Thomas, Gender=Male, Email=allanthomas@gmail.com, PhoneNumber=9955993399, Address=Guindy, Position=SWE, Dob=2000-10-10, JoiningDate=2024-05-01, TerminationDate=2055-10-10]";

    assertEquals(expected, emp1.toString());

}

}
