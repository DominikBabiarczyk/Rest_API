package pl.babiarczyk.appwithlogin_v2.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.babiarczyk.appwithlogin_v2.Manager.UsersManager;
import pl.babiarczyk.appwithlogin_v2.dao.UsersRepositories;
import pl.babiarczyk.appwithlogin_v2.dao.entity.Users;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@CrossOrigin
public class UsersApi {
    private UsersManager usersContainers;

    @Autowired
    public UsersApi(UsersManager usersContainers){this.usersContainers = usersContainers;}

    @GetMapping("/all")
    public Iterable<Users> getAll(){return usersContainers.findAll();}

    @GetMapping
    public Optional<Users> getUserById(@RequestParam Long id){return usersContainers.findById(id);}

    @PostMapping
    public Users addUser(@RequestBody Users users){
        return usersContainers.save(users);
    }

    @PutMapping
    public Users updateUser(@RequestBody Users users){return usersContainers.save(users);}

    @DeleteMapping
    public void deleteUser(@RequestBody Long index){usersContainers.deleteById(index);}

}
