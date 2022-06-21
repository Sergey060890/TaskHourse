package Hourse.util;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {

    public static final String PERSISTENCE_UNIT_NAME = "hourse";

    /**
     * Method to create EntityManagerFactory
     */
    public static final EntityManagerFactory ENTITY_MANAGER_FACTORY =
            Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);

    /**
     * Method to return EntityManager
     */
    public static EntityManager getEntityManager() {
        return ENTITY_MANAGER_FACTORY.createEntityManager();
    }

    /**
     * Method to close EntityManagerFactory
     */
    public static void close() {
        ENTITY_MANAGER_FACTORY.close();
    }
}