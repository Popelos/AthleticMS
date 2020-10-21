/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package popelos.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import popelos.entity.Stadium;

public class StadiumDao extends SuperDao {

    public List<Stadium> getStadiumList() {
        EntityManager em = openConnection();
        TypedQuery<Stadium> query = em.createNamedQuery("Stadium.findAll", Stadium.class);
        List<Stadium> aList = query.getResultList();
        closeConnection();
        return aList;
    }

}
