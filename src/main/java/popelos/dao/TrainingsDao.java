/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package popelos.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import popelos.entity.Trainings;

public class TrainingsDao extends SuperDao {

    public List<Trainings> getTrainingsList() {
        EntityManager em = openConnection();
        TypedQuery<Trainings> query = em.createNamedQuery("Trainings.findAll", Trainings.class);
        List<Trainings> aList = query.getResultList();
        closeConnection();
        return aList;
    }

}
