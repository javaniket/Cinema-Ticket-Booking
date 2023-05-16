
package com.cinematicket.admin.model;


public class Admin extends Person {
   private int admin_id;
   private String admin_email;
   private String admin_password;
   private String admin_role;

    public Admin(){
    }

    public Admin(int admin_id, String admin_email, String admin_password, String admin_role, String person_name, String person_gender, String person_dob) {
        super(person_name, person_gender, person_dob);
        this.admin_id = admin_id;
        this.admin_email = admin_email;
        this.admin_password = admin_password;
        this.admin_role = admin_role;
    }

    public Admin(String admin_email, String admin_password, String admin_role) {
        this.admin_email = admin_email;
        this.admin_password = admin_password;
        this.admin_role = admin_role;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_email() {
        return admin_email;
    }

    public void setAdmin_email(String admin_email) {
        this.admin_email = admin_email;
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }

    public String getAdmin_role() {
        return admin_role;
    }

    public void setAdmin_role(String admin_role) {
        this.admin_role = admin_role;
    }

    public void setAdmin_Id(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setAdmin_Email(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setAdmin_dob(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
   
}
