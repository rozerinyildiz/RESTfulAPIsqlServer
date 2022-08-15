package com.server.app.rest.Models;
import java.sql.Timestamp;
import javax.persistence.*;
// mysql columns, connection
@Entity
public class User {
   @Id
    private String customerID;
   @Column
    private String password;
    @Column
    private String email;
    @Column
    private String salt;

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }


}
