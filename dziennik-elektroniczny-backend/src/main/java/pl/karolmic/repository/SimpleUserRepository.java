//package pl.karolmic.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.QueryByExampleExecutor;
//import org.springframework.transaction.annotation.Transactional;
//import pl.karolmic.model.User;
//
//import java.util.List;
//
//public interface SimpleUserRepository extends JpaRepository<User, String> {
//
//	User findByUserName(String username);
//
//	List<User> findAll();
//
//}
