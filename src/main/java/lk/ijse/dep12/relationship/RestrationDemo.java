package lk.ijse.dep12.relationship;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import lk.ijse.dep12.relationship.entity.*;
import lk.ijse.dep12.relationship.entity.Module;
import lk.ijse.dep12.relationship.util.JpaUtil;

import java.sql.Date;
import java.time.LocalDate;

public class RestrationDemo {

    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
             EntityManager em = emf.createEntityManager()) {
            EntityTransaction tx = em.getTransaction();
            try {
                tx.begin();
                Student menith = em.find(Student.class, "962012858V");
                Student sachith = em.find(Student.class, "965658858V");
                Student lahiru = em.find(Student.class, "200041356899V");

                User u001 = em.find(User.class,"U001");
                User u002 = em.find(User.class,"U002");

                Course c001 = em.find(Course.class, "C001");
                Course c002 = em.find(Course.class, "C002");
                Course c003 = em.find(Course.class, "C003");

                Batch b001 = em.find(Batch.class,"B001");
                Batch b002 =  em.find(Batch.class,"B001");

                Module m001 = em.find(Module.class, "M001");
                Module m002 = em.find(Module.class, "M002");

                Registration registration =new Registration(sachith,u001,b001, Date.valueOf(LocalDate.now()));
                Take take = new Take(b002,sachith,m002);

                em.persist(registration);
                em.persist(take);




                tx.commit();
            } catch (Throwable e) {
                tx.rollback();
                e.printStackTrace();
            }
        }
    }
}
