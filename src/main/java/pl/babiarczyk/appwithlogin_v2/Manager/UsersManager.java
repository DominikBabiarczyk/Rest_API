package pl.babiarczyk.appwithlogin_v2.Manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.babiarczyk.appwithlogin_v2.dao.UsersRepositories;
import pl.babiarczyk.appwithlogin_v2.dao.entity.Users;

import java.util.Optional;

@Service
public class UsersManager {
    private UsersRepositories usersRepositories;

    @Autowired
    public UsersManager(UsersRepositories usersRepositories){
        this.usersRepositories = usersRepositories;
    }

    public Optional<Users> findById(Long id){return usersRepositories.findById(id);}

    public Iterable<Users> findAll(){return usersRepositories.findAll();}

    public Users save(Users users){return usersRepositories.save(users);}

    public void deleteById(Long id){usersRepositories.deleteById(id);}

    @EventListener(ApplicationReadyEvent.class)
    public void findDB(){
    save(new Users("DDumel", "123", 1L, ""));
    save(new Users("Dominik", "123", 2L, ""));
    }
}
