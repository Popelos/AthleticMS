package popelos.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import popelos.entity.Athlete;

public class AthleteDao extends SuperDao{

    public List<Athlete> getAthleteList(){
        EntityManager em = openConnection();
        TypedQuery<Athlete> query = em.createNamedQuery("Athlete.findAll", Athlete.class);
        List<Athlete> aList = query.getResultList();     
        closeConnection();
        return aList;
    }
}
