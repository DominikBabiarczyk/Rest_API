package pl.babiarczyk.appwithlogin_v2.Manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.babiarczyk.appwithlogin_v2.dao.InvitationsRepositories;
import pl.babiarczyk.appwithlogin_v2.dao.entity.Invitations;

import java.util.Optional;

@Service
public class InvitationsManager {
    private InvitationsRepositories invitationsRepositories;

    @Autowired
    public InvitationsManager(InvitationsRepositories invitationsRepositories){this.invitationsRepositories = invitationsRepositories;}

    public Optional<Invitations> findById(Long id){return invitationsRepositories.findById(id);}

    public Iterable<Invitations> findAll(){return invitationsRepositories.findAll();}

    public Invitations save(Invitations invitations){return invitationsRepositories.save(invitations);}

    public void deleteById(Long id){invitationsRepositories.deleteById(id);}

    @EventListener(ApplicationReadyEvent.class)
    public void findDB(){

    }
}
