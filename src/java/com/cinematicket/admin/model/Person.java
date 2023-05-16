
package com.cinematicket.admin.model;


public class Person {
    private String person_name;
    private String person_gender;
    private String person_dob;

    public Person() {
    }

    public Person(String person_name, String person_gender, String person_dob) {
        this.person_name = person_name;
        this.person_gender = person_gender;
        this.person_dob = person_dob;
    }

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public String getPerson_gender() {
        return person_gender;
    }

    public void setPerson_gender(String person_gender) {
        this.person_gender = person_gender;
    }

    public String getPerson_dob() {
        return person_dob;
    }

    public void setPerson_dob(String person_dob) {
        this.person_dob = person_dob;
    }


    
    
}
