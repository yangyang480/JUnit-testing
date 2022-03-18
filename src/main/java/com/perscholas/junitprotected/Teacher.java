package com.perscholas.junitprotected;

public class Teacher {
    int id;
    String email;
    String fName;
    String lName;

    public Teacher() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Teacher(int id, String email, String fName, String lName) {
        this.id = id;
        this.email = email;
        this.fName = fName;
        this.lName = lName;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Teacher) {
            Teacher other = (Teacher) obj;
            boolean sameId = (this.id == other.getId());
            boolean sameEmail = (this.email.equals(other.getEmail()));
            boolean sameFName = (this.fName.equals(other.getfName()));
            boolean sameLName = (this.lName.equals(other.getlName()));
            if (sameId && sameEmail && sameFName && sameLName) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return id + " " + fName + " " + lName + " " + email;
    }

}

