package lk.ijse.dep12.relationship.util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {
    private static final EntityManagerFactory emf = buildEntityManagerFactory();

    private static EntityManagerFactory buildEntityManagerFactory() {
        return Persistence.createEntityManagerFactory("dep-12");
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }
}
