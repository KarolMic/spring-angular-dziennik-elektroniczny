package pl.karolmic.security.repository.nativequery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.karolmic.security.entity.User;

import javax.persistence.EntityManager;
import javax.validation.ConstraintViolationException;
import java.util.HashSet;

@Service
@Transactional
public class NativeQueryUserRepository {

    @Autowired
    private EntityManager entityManager;

    public int getUsersByEmail(String email) {
        entityManager.createNativeQuery("select email from user").getResultList();
        return entityManager.createNativeQuery("select email from User where email = ?").setParameter(1, email).getResultList().size();
    }

    public void persist(User user) {
        if (getUsersByEmail(user.getEmail()) > 0) {
            throw new ConstraintViolationException("There is existing user with this email.", new HashSet<>());
        }
        entityManager.createNativeQuery("select * from user").getResultList();
        entityManager.persist(user);
    }
}
