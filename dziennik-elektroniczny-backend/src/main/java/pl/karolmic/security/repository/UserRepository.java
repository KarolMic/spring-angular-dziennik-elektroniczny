
package pl.karolmic.security.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.karolmic.security.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserName(String username);

    User save(User user);

    @Override
    <S extends User> long count(Example<S> example);
}
