
package popelos.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class SuperDao {
    
    protected static EntityManagerFactory emf;
    private static EntityManager em;
    
    protected static void openEMF(){
        SuperDao.emf= Persistence.createEntityManagerFactory("athleticmsPU");
    }
    
    protected static void closeEMF(){
        SuperDao.emf.close();
    }
    
    private EntityManager getEntityManager(){
        em=emf.createEntityManager();
        return em;
    }
    
    protected EntityManager openConnection(){
        EntityManager em1 = getEntityManager();
        return em1;
    }
    
    protected void closeConnection(){
        em.close();
    }
}
