package pl.babiarczyk.appwithlogin_v2.dao.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Invitations {
    private String fromUser;
    private String toUser;
    private boolean answer;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    public Invitations(){}

    public Invitations(String fromUser, String toUser, boolean answer, Long id){
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.answer = answer;
        this.id=id;
    }

    public String getFromUser() {
        return fromUser;
    }

    public void setFromUser(String fromUser) {
        this.fromUser = fromUser;
    }

    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        toUser = toUser;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
