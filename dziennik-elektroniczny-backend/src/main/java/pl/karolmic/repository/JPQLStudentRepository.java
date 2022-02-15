package pl.karolmic.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.karolmic.interceptor.MySayHelloInterceptorBinding;
import pl.karolmic.interceptor.SayHelloInterceptor;
import pl.karolmic.model.Student;

import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;

@Service
public class JPQLStudentRepository {

    @Autowired
    EntityManager entityManager;

    @Interceptors(SayHelloInterceptor.class)
    public Student getStudentByName(String name) {
        return entityManager.createNamedQuery(Student.GET_STUDENT_BY_NAME, Student.class).setParameter(1, name).getResultList().get(0);
    }
}
