package com.application.webservice.ApplicationWeb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name = "USERS")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String pseudo;
    private String mdp;

    public Users(){
        
    }

    public Users(String pseudo, String mdp){
        this.pseudo = pseudo;
        this.mdp = mdp;
    }
    public long getId(){
        return id;
    }

    public String getPseudo(){
        return pseudo;
    }

    public String getMdp(){
        return mdp;
    }
    public void setId(long id){
        this.id = id;
    }

    public void setPseudo(String pseudo){
        this.pseudo = pseudo;
    }

    public void setPrenom(String mdp){
        this.mdp = mdp;
    }

}
