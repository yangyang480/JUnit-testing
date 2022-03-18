package com.perscholas.junitprotected;

public class Student {
    public int id;
    public String Firstname;
    public String Lastname;
    public String email;

    public Student(int id, String firstname, String lastname, String email) {
        this.id = id;
        Firstname = firstname;
        Lastname = lastname;
        this.email = email;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student other = (Student) obj;
            boolean sameId = (this.id == other.getId());
            boolean sameEmail = (this.email.equals(other.getEmail()));
            boolean sameFName = (this.Firstname.equals(other.getFirstname()));
            boolean sameLName = (this.Lastname.equals(other.getLastname()));
            if (sameId && sameEmail && sameFName && sameLName) {
                return true;
            }
        }
        return false;
    }
}
