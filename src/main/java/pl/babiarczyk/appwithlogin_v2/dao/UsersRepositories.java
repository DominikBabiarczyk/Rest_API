package pl.babiarczyk.appwithlogin_v2.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.babiarczyk.appwithlogin_v2.dao.entity.Users;

public interface UsersRepositories extends JpaRepository<Users, Long>{
}
