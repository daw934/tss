package pl.dawid.dao;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import pl.dawid.model.Student;

import javax.persistence.*;
import java.util.List;

@Repository
public class StudentDAO {
    private static final Logger log = LoggerFactory.getLogger(StudentDAO.class);

    @PersistenceUnit
    private EntityManagerFactory emf;

    public void save(Student student) {
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist(student);
        tx.commit();
        entityManager.close();
    }

    public List<Student> get() {
        EntityManager entityManager = emf.createEntityManager();
        TypedQuery<Student> allStudent = entityManager.createQuery("SELECT student from Student student", Student.class);
        return allStudent.getResultList();
    }

    public void delete(Long id) {
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction et = entityManager.getTransaction();
        et.begin();
        entityManager.createQuery("delete from Student student where student.id=:id")
                .setParameter("id", id).executeUpdate();
        et.commit();
        entityManager.close();
    }
}
