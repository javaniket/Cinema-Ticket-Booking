
package com.cinematicket.admin.dao;

import com.cinematicket.admin.model.Admin;
import java.sql.*;
public class AdminDao {
    private final Connection con;
    private String query;
    private PreparedStatement pst;
    private ResultSet rs;

    public AdminDao(Connection con) {
        this.con = con;
    }
    public Admin logAdmin(String admin_email, String admin_password){
       Admin admin = null;
        try{
       query ="select from admin where admin_email=? and admin_password=?";
       pst = this.con.prepareStatement(query);
        pst.setString(1, admin_email);
        pst.setString(2,admin_password);
        if(rs.next()){
            admin = new Admin();
            admin.setAdmin_Id(rs.getInt("admin_id"));
            admin.setAdmin_email(rs.getString("admin_email"));
            admin.setAdmin_dob(rs.getString("admin_dob"));
            admin.setAdmin_role(rs.getString("admin_role"));
        }
        }catch(SQLException ex){
            ex.printStackTrace();
        } 
    return admin;
    }
}
