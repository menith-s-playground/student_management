package lk.ijse.dep12.relationship;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import lk.ijse.dep12.relationship.entity.Student;
import lk.ijse.dep12.relationship.entity.StudentContact;
import lk.ijse.dep12.relationship.util.JpaUtil;

import java.util.List;

public class AddStudent {

    public static void main(String[] args) {
        try (EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
             EntityManager em = emf.createEntityManager()) {
            EntityTransaction tx = em.getTransaction();
            try {
                tx.begin();
                Student menith=new Student("962012858V","Menith","Rathnapura");
                Student sachith=new Student("965658858V","Sachith","Matara");
                Student lahiru=new Student("200041356899V","Lahiru","Galle");

                StudentContact menithContact1 = new StudentContact(menith,"071-4364363");
                StudentContact menithContact2 = new StudentContact(menith,"076-4364363");
                StudentContact sachithContact1 = new StudentContact(sachith,"078-1215147");
                StudentContact sachithContact2 = new StudentContact(sachith,"076-1215147");
                StudentContact lahiruContact1 = new StudentContact(lahiru,"076-1287896");

                List.of(menith,sachith,lahiru,menithContact1,menithContact2,sachithContact1,sachithContact2,lahiruContact1).forEach(em::persist);

                tx.commit();
            } catch (Throwable e) {
                tx.rollback();
                e.printStackTrace();
            }
        }
    }
}
