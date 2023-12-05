package jay.amigosjwt.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import jay.amigosjwt.Model.User;

public interface UserRepository extends JpaRepository<User,Integer>{

    Optional<User> findByEmail(String email);
}
