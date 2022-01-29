package com.followup.backend.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "User")
public class User implements Serializable {

    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_user;

    private String mail;
    private String password;
    private String userName;

    public User(String mail, String password, String userName) {
        this.mail = mail;
        this.password = password;
        this.userName = userName;
    }

    public User() {

    }

    public Long getId_user(){
        return this.id_user;
    }

    public String getMail(){
        return this.mail;
    }

    public String getPassword(){
        return this.password;
    }

    public String getUserName(){
        return this.userName;
    }

    public void setMail(String mail){
        this.mail = mail;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setId_user(Long id_user){
        this.id_user = id_user;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

}
