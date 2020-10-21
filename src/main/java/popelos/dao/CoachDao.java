
package popelos.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import popelos.entity.Coach;


public class CoachDao extends SuperDao{
    
      public List<Coach> getCoachList(){
        EntityManager em = openConnection();
        TypedQuery<Coach> query = em.createNamedQuery("Coach.findAll", Coach.class);
        List<Coach> aList = query.getResultList();     
        closeConnection();
        return aList;
    }
    
}
