
package com.cinematicket.user.dao;

import com.cinematicket.admin.model.Person;

public class User extends Person{
   private int user_id;
   private String user_email;
   private String user_password;

   public User(){}

    public User(int user_id, String user_email, String user_password, String person_name, String person_gender, String person_dob) {
        super(person_name, person_gender, person_dob);
        this.user_id = user_id;
        this.user_email = user_email;
        this.user_password = user_password;
    }

    public User(String user_email, String user_password, String person_name, String person_gender, String person_dob) {
        super(person_name, person_gender, person_dob);
        this.user_email = user_email;
        this.user_password = user_password;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    @Override
    public String toString() {
        return super.toString();
    }

   

    


    
   
   

   

    
}
