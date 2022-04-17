package com.application.webservice.ApplicationWeb;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;

@Entity
@Table(name = "TACHE")
public class Tache {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String description;
    private long user;

    public Tache(long id, String description, long user){
        this.id = id;
        this.description = description;
        this.user = user;
    }
    public long getId(){
        return id;
    }

    public String getDescription(){
        return description;
    }

    public long getUserId(){
        return user;
    }
    public void setId(long id){
        this.id = id;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setuserId(long user){
        this.user = user;
    }
}
