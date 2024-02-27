package pl.babiarczyk.appwithlogin_v2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.babiarczyk.appwithlogin_v2.dao.entity.Invitations;

public interface InvitationsRepositories extends JpaRepository<Invitations, Long> {
}
