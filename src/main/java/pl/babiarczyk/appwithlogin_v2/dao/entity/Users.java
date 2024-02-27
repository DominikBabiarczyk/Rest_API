package pl.babiarczyk.appwithlogin_v2.dao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Users {
    private String name;
    private String password;

    private String invitation;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    public Users(){}

    public Users(String name, String password, Long id, String invitation){
        this.name = name;
        this.password = password;
        this.id = id;
        this.invitation = invitation;
    }

    public String getInvitation() {
        return invitation;
    }

    public void setInvitation(String invitation) {
        this.invitation = invitation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
