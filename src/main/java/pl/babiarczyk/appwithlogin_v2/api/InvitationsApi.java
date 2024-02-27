package pl.babiarczyk.appwithlogin_v2.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.babiarczyk.appwithlogin_v2.Manager.InvitationsManager;
import pl.babiarczyk.appwithlogin_v2.dao.entity.Invitations;
import pl.babiarczyk.appwithlogin_v2.dao.entity.Users;

import java.util.Optional;

@RestController
@RequestMapping("/api/invitations")
@CrossOrigin
public class InvitationsApi {
    private InvitationsManager invitationsContainer;

    @Autowired
    public InvitationsApi(InvitationsManager invitationsContainer){this.invitationsContainer = invitationsContainer;}

    @GetMapping("/all")
    public Iterable<Invitations> getAll(){return invitationsContainer.findAll();}

    @GetMapping
    public Optional<Invitations> getInvitationById(@RequestParam Long id){return invitationsContainer.findById(id);}

    @PostMapping("/add")
    public Invitations addInvitations(@RequestBody Invitations invitations){return invitationsContainer.save(invitations);}

    @PutMapping
    public Invitations upDateInvitation(@RequestBody Invitations invitations){return invitationsContainer.save(invitations);}

    @DeleteMapping
    public void deleteInvitation(@RequestBody Long id){invitationsContainer.deleteById(id);}

}

